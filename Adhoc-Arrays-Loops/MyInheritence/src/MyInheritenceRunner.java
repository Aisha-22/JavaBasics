public class MyInheritenceRunner {

    public static void main(String[] args) {

        Movie movie = new Movie("Stamp The Yard", "Dance");
        movie.play();

        Series series = new Series("How to ruin Xmas", "Love");
        series.play();

        Soupie soupie = new Soupie("Generations", "Drama");
        soupie.play();

        Tutoriels tutoriels = new Tutoriels("Selenium", "Automation");
        tutoriels.play();

        Cartoon cartoon = new Cartoon("Sophia", "fairy tail");
        cartoon.play();

        Music music = new Music("Tyhini", "HipPop");
        music.play();
    }
}
