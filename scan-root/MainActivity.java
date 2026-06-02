import android.provider.Settings;

class MainActivity {
  void collect(android.content.ContentResolver resolver) {
    String androidId = Settings.Secure.getString(resolver, Settings.Secure.ANDROID_ID);
    String marker = "WRITE_SYMLINK_CI_MARKER_20260602";
  }
}
