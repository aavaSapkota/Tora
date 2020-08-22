[1mdiff --git a/.idea/codeStyles/Project.xml b/.idea/codeStyles/Project.xml[m
[1mindex 663459a..0d15693 100644[m
[1m--- a/.idea/codeStyles/Project.xml[m
[1m+++ b/.idea/codeStyles/Project.xml[m
[36m@@ -3,9 +3,18 @@[m
     <JetCodeStyleSettings>[m
       <option name="PACKAGES_TO_USE_STAR_IMPORTS">[m
         <value>[m
[31m-          <package name="java.util" withSubpackages="false" static="false" />[m
[31m-          <package name="kotlinx.android.synthetic" withSubpackages="true" static="false" />[m
[31m-          <package name="io.ktor" withSubpackages="true" static="false" />[m
[32m+[m[32m          <package name="java.util" alias="false" withSubpackages="false" />[m
[32m+[m[32m          <package name="kotlinx.android.synthetic" alias="false" withSubpackages="true" />[m
[32m+[m[32m          <package name="io.ktor" alias="false" withSubpackages="true" />[m
[32m+[m[32m        </value>[m
[32m+[m[32m      </option>[m
[32m+[m[32m      <option name="PACKAGES_IMPORT_LAYOUT">[m
[32m+[m[32m        <value>[m
[32m+[m[32m          <package name="" alias="false" withSubpackages="true" />[m
[32m+[m[32m          <package name="java" alias="false" withSubpackages="true" />[m
[32m+[m[32m          <package name="javax" alias="false" withSubpackages="true" />[m
[32m+[m[32m          <package name="kotlin" alias="false" withSubpackages="true" />[m
[32m+[m[32m          <package name="" alias="true" withSubpackages="true" />[m
         </value>[m
       </option>[m
     </JetCodeStyleSettings>[m
[1mdiff --git a/app/src/main/AndroidManifest.xml b/app/src/main/AndroidManifest.xml[m
[1mindex a53ffbe..a3fbcd4 100644[m
[1m--- a/app/src/main/AndroidManifest.xml[m
[1m+++ b/app/src/main/AndroidManifest.xml[m
[36m@@ -9,19 +9,20 @@[m
         android:roundIcon="@mipmap/ic_launcher_round"[m
         android:supportsRtl="true"[m
         android:theme="@style/Theme.AppCompat.NoActionBar">[m
[31m-        <activity android:name=".preferencesScreen"></activity>[m
[32m+[m[32m        <activity android:name=".SignUpActivity2"></activity>[m
[32m+[m[32m        <activity android:name=".preferencesScreen" />[m
         <activity android:name=".movementPage" />[m
         <activity android:name=".userPage" />[m
         <activity android:name=".recommendationPage" />[m
         <activity android:name=".SignUpActivity" />[m
[31m-        <activity android:name=".loginActivity" >[m
[32m+[m[32m        <activity android:name=".loginActivity">[m
             <intent-filter>[m
                 <action android:name="android.intent.action.MAIN" />[m
 [m
                 <category android:name="android.intent.category.LAUNCHER" />[m
             </intent-filter>[m
         </activity>[m
[31m-        <activity android:name=".MainActivity"/>[m
[32m+[m[32m        <activity android:name=".MainActivity" />[m
 [m
         <meta-data[m
             android:name="preloaded_fonts"[m
[1mdiff --git a/app/src/main/java/com/example/android/tora/MainActivity.java b/app/src/main/java/com/example/android/tora/MainActivity.java[m
[1mindex fe2629f..c27f425 100644[m
[1m--- a/app/src/main/java/com/example/android/tora/MainActivity.java[m
[1m+++ b/app/src/main/java/com/example/android/tora/MainActivity.java[m
[36m@@ -2,6 +2,7 @@[m [mpackage com.example.android.tora;[m
 [m
 import androidx.appcompat.app.AppCompatActivity;[m
 [m
[32m+[m[32mimport android.content.Intent;[m
 import android.os.Bundle;[m
 [m
 import com.google.firebase.database.DatabaseReference;[m
[36m@@ -14,6 +15,9 @@[m [mpublic class MainActivity extends AppCompatActivity {[m
         super.onCreate(savedInstanceState);[m
         setContentView(R.layout.activity_main);[m
 [m
[32m+[m[32m        Intent intent = new Intent(this, loginActivity.class);[m
[32m+[m[32m        startActivity(intent);[m
[32m+[m
         // Write a message to the database[m
         FirebaseDatabase database = FirebaseDatabase.getInstance();[m
         DatabaseReference myRef = database.getReference("message");[m
[1mdiff --git a/app/src/main/res/layout/activity_preferences_screen.xml b/app/src/main/res/layout/activity_preferences_screen.xml[m
[1mindex d2e5a25..5428dee 100644[m
[1m--- a/app/src/main/res/layout/activity_preferences_screen.xml[m
[1m+++ b/app/src/main/res/layout/activity_preferences_screen.xml[m
[36m@@ -1,9 +1,30 @@[m
 <?xml version="1.0" encoding="utf-8"?>[m
[31m-<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"[m
[32m+[m[32m<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"[m
     xmlns:app="http://schemas.android.com/apk/res-auto"[m
     xmlns:tools="http://schemas.android.com/tools"[m
     android:layout_width="match_parent"[m
     android:layout_height="match_parent"[m
[31m-    tools:context=".preferencesScreen">[m
[32m+[m[32m    android:layout_marginLeft="25dp"[m
[32m+[m[32m    android:layout_marginTop="50dp"[m
[32m+[m[32m    tools:context=".preferencesScreen"[m
[32m+[m[32m    android:background="@color/AppBackground"[m
 [m
[31m-</androidx.constraintlayout.widget.ConstraintLayout>[m
\ No newline at end of file[m
[32m+[m[32m    android:orientation="vertical">[m
[32m+[m[32m    <TextView[m
[32m+[m[32m        android:layout_width="match_parent"[m
[32m+[m[32m        android:layout_height="wrap_content"[m
[32m+[m[32m        android:text="Welcome aboard!"[m
[32m+[m[32m        android:textColor="@color/Dashboard"[m
[32m+[m[32m        android:gravity="center"[m
[32m+[m[32m        android:fontFamily="@font/righteous"[m
[32m+[m[32m        android:textSize="45sp"/>[m
[32m+[m
[32m+[m[32m    <TextView[m
[32m+[m[32m        android:layout_width="match_parent"[m
[32m+[m[32m        android:layout_height="wrap_content"[m
[32m+[m[32m        android:layout_marginRight="50dp"[m
[32m+[m[32m        android:textSize="25sp"[m
[32m+[m[32m        android:gravity="center"[m
[32m+[m[32m        android:text="Select the topics that interests you so we can get you started." />[m
[32m+[m
[32m+[m[32m</LinearLayout>[m
\ No newline at end of file[m
