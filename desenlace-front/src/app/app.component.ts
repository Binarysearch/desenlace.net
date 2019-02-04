import { Component } from '@angular/core';
import { Project } from './project';
import { ProjectsService } from './projects.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Desenlace.net';
  public projects: Project[];

  constructor(private projectsService: ProjectsService) { }

  getProjects(): void {
    this.projectsService.getProjects().subscribe(projects => {
      this.projects = projects;
    });
    
  }

  ngOnInit() {
    this.getProjects();
  }
}
