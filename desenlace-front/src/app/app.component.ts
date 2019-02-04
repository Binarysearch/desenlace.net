import { Component } from '@angular/core';
import { Project } from './project';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Desenlace.net';
  public projects: Project[] = [
    {
      name:"Desenlace.net",
      description:"Es esta página web!",
      link:"https://www.desenlace.net",
      tecnologies: [
        "Angular", "HTML", "CSS", "Js", "TypeScript", "Java", "SQL", "Git", "Maven", "REST", "Postgre SQL", "Tomcat", "Apache 2"
      ]
    },
    {
      name:"Bitschool.es",
      description:"Web con mini cursos de programación",
      link:"https://www.bitschool.es",
      tecnologies: [
        "HTML", "CSS", "Js"
      ]
    },
    {
      name:"Galaxyvictor",
      description:"Videojuego multijugador online con el objetivo de la conquista galactica",
      link:"https://www.galaxyvictor.com",
      tecnologies: [
        "HTML", "CSS", "Js", "WebGL", "Java", "SQL"
      ]
    }

  ];
}
