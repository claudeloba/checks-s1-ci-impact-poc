package com.example.c1;

import android.provider.Settings;

class MainActivity {
  void collect(android.content.ContentResolver resolver) {
    String androidId = Settings.Secure.getString(resolver, Settings.Secure.ANDROID_ID);
  }
}
