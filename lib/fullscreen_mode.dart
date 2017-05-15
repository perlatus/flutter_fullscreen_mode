import 'dart:async';

import 'package:flutter/services.dart';

class FullscreenMode {
  static const MethodChannel _channel =
      const MethodChannel('fullscreen_mode');

  static Future<String> get platformVersion =>
      _channel.invokeMethod('getPlatformVersion');
}
