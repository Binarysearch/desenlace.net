package net.desenlace;

import java.util.ArrayList;
import java.util.List;

public class ProjectsService{

	public List<Project> getProjects() {
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

		projects.add(new Project(
			"DcCMS",
			"Headless CMS basado en procedimientos PL/PgSQL",
			"https://www.linuxhacker.es/cms/api-editor",
			"https://github.com/Binarysearch/dccms",
			new String[]{"HTML", "CSS", "Js", "SQL", "Java", "PL/PgSQL", "Linux", "Tomcat", "Monaco editor"}
        ));
        
		return projects;
	}

}