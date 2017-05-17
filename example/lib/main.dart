import 'package:flutter/material.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

import 'package:fullscreen_mode/fullscreen_mode.dart';

void main() {
  runApp(new MaterialApp(
      home: new Scaffold(
          appBar: new AppBar(title: new Text("Fullscreen Demo")),
          body: new Center(child: new Column(children: <Widget>[
            new RaisedButton(
                child: new Text("normal"), onPressed: FullscreenMode.setNormal),
            new RaisedButton(
                child: new Text("fullscreen"),
                onPressed: FullscreenMode.setFullscreen),
          ])))));
}
