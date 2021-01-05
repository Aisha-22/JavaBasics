public class Video {
    public String title;
    public String genre;

    //This constructor is called super by the classes that are inhereting from it.
    public Video(String title, String genre){
        this.title = title;
        this.genre = genre;

    }
    public void play() {
        System.out.println(this.title + " is a " + this.genre + " type of video");
    }
}
