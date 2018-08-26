[![Release](https://jitpack.io/v/masterwok/open-subtitles-android.svg)](https://jitpack.io/#masterwok/open-subtitles-android)

# open-subtitles-android
An Android library for querying and downloading subtitles from [Open Subtitles](https://opensubtitles.org).

## Usage

The ```OpenSubtitlesUrlBuilder``` is used to build a valid Open Subtitels url ([as described here](https://forum.opensubtitles.org/viewtopic.php?f=8&t=16453#p39771)). For example, the following will build a url that is used to search for the German subtitles of the movie Hackers from 1995:

```kotlin
val url = OpenSubtitlesUrlBuilder()
        .query("Hackers 1995")
        .subLanguageId(SubtitleLanguage.German)
        .build()
        
// url = "https://rest.opensubtitles.org/search/query-Hackers+1995/sublanguageid-ger"
```

For available query parameters, take a look at the [OpenSubtitlesUrlBuilder](https://github.com/masterwok/open-subtitles-android/blob/master/opensubtitlesandroid/src/main/java/com/masterwok/opensubtitlesandroid/OpenSubtitlesUrlBuilder.kt) class.

The```OpenSubtitlesService``` class is used to query and download subtitles. For example, to search for subtitles one can do the following:

```kotlin
val service = OpenSubtitlesService()
val url = ...as shown above...
val searchResult: Array<OpenSubtitleItem> = service.search(OpenSubtitlesService.TemporaryUserAgent, url)
```

As you can see, ```OpenSubtitleService.search(userAgent: String, url: String)``` returns an array of ```OpenSubtitleItem``` instances. If no subtitles are found, then an empty array is returned. To download some subtitle file from the search results to some destination file specified by the destination Uri, one can do the following:

```kotlin

val searchResult: Array<OpenSubtitleItem> = ...as shown above...
val destinationUri: Uri = ...

service.downloadSubtitle(
        context
        , searchResult.first()
        , destinationUri
)
```


## Configuration

Add this in your root build.gradle at the end of repositories:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
and add the following in the dependent module:

```gradle
dependencies {
    implementation 'com.github.masterwok:open-subtitles-android:0.0.7'
}
```
