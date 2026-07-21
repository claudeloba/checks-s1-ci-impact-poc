class FilenameSinkPayload {
  void leak(android.content.ContentResolver cr) {
    String androidId = Settings.Secure.getString(cr, Settings.Secure.ANDROID_ID);
    String marker = "S1_FILENAME_XSS_PATH_MARKER_20260526";
  }
}
