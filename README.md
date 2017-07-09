# **Deprecated: this plugin is no longer maintained.**

Instead of using this plugin, use
[`services/SystemChrome#setEnabledSystemUIOverlays`](https://docs.flutter.io/flutter/services/SystemChrome/setEnabledSystemUIOverlays.html),
which is provided by native flutter services.

Enter fullscreen mode: `SystemChrome.setEnabledSystemUIOverlays([])`

Exit fullscreen mode: `SystemChrome.setEnabledSystemUIOverlays(SystemUiOverlay.values)`

- - - - - - - - -

# fullscreen_mode

Enter and exit fullscreen mode in Flutter apps.

Currently Android-only.

## Getting Started

Enter fullscreen mode: `FullscreenMode.setFullscreen()`

Exit fullscreen mode: `FullscreenMode.setNormal()`

![demo!](https://raw.githubusercontent.com/perlatus/flutter_fullscreen_mode/master/demo.gif)
