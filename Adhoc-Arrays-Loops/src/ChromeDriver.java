public class ChromeDriver {

    //Properties
    public String url;
    //Constructor
    public ChromeDriver(String youarel) {
        //'this' targeting the methods or properties of the this object/ itself
        this.url = youarel;
    }
    //Method
    public void get(String url) {
    //opens the browser and enters url
        System.out.println(url);
    }

    public void findElementBy(String id){
        System.out.println(id);

    }
}
