class MusicApp {
String appName;
double version;
String developer;
static String companyName = "SoundWave Pvt Ltd"; // static variable

MusicApp() {
    System.out.println("MusicApp Default Constructor called");
    this.appName = "DefaultApp";
    this.version = 1.0;
    this.developer = "Unknown";
}

MusicApp(String appName, double version, String developer) {
    System.out.println("MusicApp Parameterised Constructor called");
    this.appName = appName;
    this.version = version;
    this.developer = developer;
}

void setAppName(String appName) {
    this.appName = appName;
}

void setVersion(double version) {
    this.version = version;
}

void setDeveloper(String developer) {
    this.developer = developer;
}

String getAppName() {
    return appName;
}

double getVersion() {
    return version;
}

String getDeveloper() {
    return developer;
}

static String getCompanyName() {
    return companyName;
}

void display() {
    System.out.println("App Name: " + this.appName);
    System.out.println("Version: " + this.version);
    System.out.println("Developer: " + this.developer);
    System.out.println("Company Name: " + companyName);
    System.out.println();
}

} //class MusicApp ends here


class Spotify extends MusicApp {
String subscriptionType;
boolean podcastsAvailable;

Spotify() {
    super();
    System.out.println("Spotify Default Constructor called");
    this.subscriptionType = "Free";
    this.podcastsAvailable = true;
}

Spotify(String appName, double version, String developer, String subscriptionType, boolean podcastsAvailable) {
    super(appName, version, developer);
    System.out.println("Spotify Parameterised Constructor called");
    this.subscriptionType = subscriptionType;
    this.podcastsAvailable = podcastsAvailable;
}

void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
}

void setPodcastsAvailable(boolean podcastsAvailable) {
    this.podcastsAvailable = podcastsAvailable;
}

String getSubscriptionType() {
    return subscriptionType;
}

boolean getPodcastsAvailable() {
    return podcastsAvailable;
}

void display() {
    super.display();
    System.out.println("Subscription Type: " + subscriptionType);
    System.out.println("Podcasts Available: " + podcastsAvailable);
    System.out.println();
}
} //class Spotify ends here


class YouTubeMusic extends MusicApp {
boolean videoSupport;
boolean adsEnabled;

YouTubeMusic() {
    super();
    System.out.println("YouTubeMusic Default Constructor called");
    this.videoSupport = true;
    this.adsEnabled = true;
}

YouTubeMusic(String appName, double version, String developer, boolean videoSupport, boolean adsEnabled) {
    super(appName, version, developer);
    System.out.println("YouTubeMusic Parameterised Constructor called");
    this.videoSupport = videoSupport;
    this.adsEnabled = adsEnabled;
}

void setVideoSupport(boolean videoSupport) {
    this.videoSupport = videoSupport;
}

void setAdsEnabled(boolean adsEnabled) {
    this.adsEnabled = adsEnabled;
}

boolean getVideoSupport() {
    return videoSupport;
}

boolean getAdsEnabled() {
    return adsEnabled;
}

void display() {
    super.display();
    System.out.println("Video Support: " + videoSupport);
    System.out.println("Ads Enabled: " + adsEnabled);
    System.out.println();
}
} //class YouTubeMusic ends here


class AppleMusic extends MusicApp {
String deviceCompatibility;
boolean exclusiveArtists;

AppleMusic() {
    super();
    System.out.println("AppleMusic Default Constructor called");
    this.deviceCompatibility = "iOS";
    this.exclusiveArtists = true;
}

AppleMusic(String appName, double version, String developer, String deviceCompatibility, boolean exclusiveArtists) {
    super(appName, version, developer);
    System.out.println("AppleMusic Parameterised Constructor called");
    this.deviceCompatibility = deviceCompatibility;
    this.exclusiveArtists = exclusiveArtists;
}

void setDeviceCompatibility(String deviceCompatibility) {
    this.deviceCompatibility = deviceCompatibility;
}

void setExclusiveArtists(boolean exclusiveArtists) {
    this.exclusiveArtists = exclusiveArtists;
}

String getDeviceCompatibility() {
    return deviceCompatibility;
}

boolean getExclusiveArtists() {
    return exclusiveArtists;
}

void display() {
    super.display();
    System.out.println("Device Compatibility: " + deviceCompatibility);
    System.out.println("Exclusive Artists: " + exclusiveArtists);
    System.out.println();
}
} //class AppleMusic ends here


class DemoInheritance {

public static void main(String[] a) {

    Spotify s1 = new Spotify();
    s1.display();
    System.out.println(s1.getAppName());
    System.out.println("\n\n");

    YouTubeMusic y1 = new YouTubeMusic("YouTube Music", 6.2, "Google LLC", true, true);
    y1.display();
    System.out.println("\n\n");

    AppleMusic a1 = new AppleMusic("Apple Music", 5.8, "Apple Inc", "iOS, MacOS", true);
    a1.display();

    System.out.println("Company Name (Static): " + MusicApp.getCompanyName());
} //main ends here
} //DemoMusicApp ends here
