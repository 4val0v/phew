import { Post } from './../model/post';
import { Component, OnInit } from '@angular/core';
import { TimelineService } from './timeline.service';

@Component({
  selector: 'app-timeline',
  templateUrl: './timeline.component.html',
  styleUrls: ['./timeline.component.css']
})
export class TimelineComponent implements OnInit {

  name: String;
  posts: Post[];

  constructor(
    private timelineService: TimelineService,
  ) { }

  ngOnInit() {
    this.name = 'sampleName';
    this.getPosts();
  }

  getPosts() {
    this.timelineService.getPosts().subscribe(posts => this.posts = posts);
  }
}
