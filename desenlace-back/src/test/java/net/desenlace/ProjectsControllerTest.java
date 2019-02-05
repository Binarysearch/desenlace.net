package net.desenlace;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeType;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ProjectsControllerTest {

    @Test
    public void testGetProjects() throws Exception {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        Mockito.when(response.getWriter()).thenReturn(writer);

        
        
        ProjectsService projectsService = Mockito.mock(ProjectsService.class);
        Mockito.when(projectsService.getProjects()).thenReturn(new ArrayList<Project>(){
            private static final long serialVersionUID = 8115259023541028803L;

            {
            add(new Project(
                "Desenlace.net",
                "Es esta página web!",
                "https://www.desenlace.net",
                "https://github.com/Binarysearch/desenlace.net",
                new String[]{"Angular", "HTML", "CSS", "Js", "TypeScript", "Java", "SQL", "Git", "Maven", "REST", "Postgre SQL", "Tomcat", "Apache 2"}
            ));
        }});

        new ProjectsController(projectsService).doGet(request, response);
        
        writer.flush();

        ObjectMapper om = new ObjectMapper();
        JsonNode rootNode = om.readTree(stringWriter.toString());
        Assert.assertEquals(rootNode.getNodeType(), JsonNodeType.ARRAY);
        
        JsonNode firstProject = rootNode.get(0);
        
        Assert.assertEquals(firstProject.getNodeType(), JsonNodeType.OBJECT);
        Assert.assertEquals(firstProject.get("name").textValue(), "Desenlace.net");
        Assert.assertEquals(firstProject.get("description").textValue(), "Es esta página web!");
        Assert.assertEquals(firstProject.get("link").textValue(), "https://www.desenlace.net");
        Assert.assertEquals(firstProject.get("sourceLink").textValue(), "https://github.com/Binarysearch/desenlace.net");
        
        JsonNode tecnologies = firstProject.get("tecnologies");
        Assert.assertEquals(tecnologies.getNodeType(), JsonNodeType.ARRAY);
        for (JsonNode n : tecnologies) {
            Assert.assertEquals(n.getNodeType(), JsonNodeType.STRING);
        }
    }
}