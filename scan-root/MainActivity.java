package poc;

import android.provider.Settings;

final class MainActivity {
  String probe(android.content.ContentResolver resolver) {
    String marker = "T1_PYTHON_VENV_PTH_CI_SOURCE_MARKER_20260602";
    String androidId = Settings.Secure.getString(resolver, Settings.Secure.ANDROID_ID);
    return marker + ":" + androidId;
  }
}
