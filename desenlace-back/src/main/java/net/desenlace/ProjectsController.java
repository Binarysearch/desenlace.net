package net.desenlace;

import java.io.IOException;
import java.util.ArrayList;
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

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();

		List<Project> projects = new ArrayList<>();

		projects.add(new Project(
			"Desenlace.net",
			"Es esta página web!",
			"https://www.desenlace.net",
			"https://github.com/Binarysearch/desenlace.net",
			new String[]{"Angular", "HTML", "CSS", "Js", "TypeScript", "Java", "SQL", "Git", "Maven", "REST", "Postgre SQL", "Tomcat", "Apache 2"}
		));

		projects.add(new Project(
			"Bitschool.es",
			"Web con mini cursos de programación",
			"https://www.bitschool.es",
			"https://github.com/Binarysearch/Bitschool.es",
			new String[]{"HTML", "CSS", "Js"}
		));

		projects.add(new Project(
			"GalaxyVictor",
			"Videojuego multijugador online con el objetivo de la conquista galactica",
			"https://www.galaxyvictor.com",
			"https://github.com/Binarysearch/GalaxyVictor",
			new String[]{"HTML", "CSS", "Js", "WebGL", "Java", "SQL"}
		));



		String projectsString = mapper.writeValueAsString(projects);

		response.setHeader("Access-Control-Allow-Origin", "*");

		response.getWriter().append(projectsString);
	}

}