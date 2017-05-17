package io.vczf.fullscreen_mode;

import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.PluginRegistry.Registrar;

import android.view.View;


/**
 * FullscreenModePlugin
 */
public class FullscreenModePlugin implements MethodCallHandler {
    /**
     * Plugin registration.
     */
    public static void registerWith(Registrar registrar) {
        final MethodChannel channel = new MethodChannel(registrar.messenger(), "fullscreen_mode");
        channel.setMethodCallHandler(new FullscreenModePlugin((FlutterActivity)registrar.activity()));
    }

    private final FlutterActivity activity;

    private FullscreenModePlugin(FlutterActivity activity) {
        this.activity = activity;
    }

    @Override
    public void onMethodCall(MethodCall call, Result result) {
        if (call.method.equals("setFullscreen")) {
            activity.getFlutterView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                    | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            );
        } else if (call.method.equals("setNormal")) {
            activity.getFlutterView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
        } else {
            result.notImplemented();
        }
    }
}
