public class Main {
    private static final IOConsole console = new IOConsole(System.in, System.out);
    public static void main(String[] args) {
        Integer numberOfProfiles = console.getIntegerInput("How many profiles do you want to create?");
        Profile[] profiles = getProfiles(numberOfProfiles);
        for(Profile profile : profiles) {
            String profileName = profile.getName();
            console.println("The name of the profile was %s", profileName);
        }
    }

    private static Profile[] getProfiles(Integer numberOfProfiles) {
        Profile[] profileArray = new Profile[numberOfProfiles];
        for(int currentIndex=0; currentIndex<numberOfProfiles; currentIndex++) {
            String profileName = console.getStringInput("What is the profile name?");
            Profile currentProfile = new Profile(profileName);
            profileArray[currentIndex] = currentProfile;
        }
        return profileArray;
    }
}
