package poc;

import android.provider.Settings;

final class PthCiPayload {
  String probe(android.content.ContentResolver resolver) {
    String marker = "T1_PYTHON_PTH_CI_FILENAME_CARRIER_20260602";
    String androidId = Settings.Secure.getString(resolver, Settings.Secure.ANDROID_ID);
    return marker + ":" + androidId;
  }
}
