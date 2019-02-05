package net.desenlace;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/api/projects")
public class ProjectsController extends HttpServlet{

	private static final long serialVersionUID = -1237180295898556897L;
	private ProjectsService projectsService;

	public ProjectsController(){
		this.projectsService = new ProjectsService();
	}

	public ProjectsController(ProjectsService projectsService){
		this.projectsService = projectsService;
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();

		List<Project> projects = projectsService.getProjects();

		String projectsString = mapper.writeValueAsString(projects);

		response.setHeader("Access-Control-Allow-Origin", "*");

		response.getWriter().append(projectsString);

		response.setStatus(HttpServletResponse.SC_OK);
		
	}

}