//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import static java.lang.IO.println;

public static class Movies{

    // create method that adds movie to genre
    public void add(String movie) {
        Horror.title = movie;
    }
    // call method that gets movie name






    // subclass that holds Horror genre
    public class Horror extends Movies{
        public static String title = "";
        private String getMovie(){

            return(title);
        }

    }
    // subclass that holds Sci-Fi genre
    public class SciFi extends Movies{
        private String title = "Bladerunner";
        private String getMovie(){

            return(title);
        }


    }
    // subclass that holds Romance genre
    public static class Romance extends Movies{
        private String title = "Doctor Zhivago";


        private String getMovie(){
            return(title);

        }

    }
}

void main() {
    {
        Movies library = new Movies();
        // Add a movie to the library
        library.add("The Bride of Frankenstein");




    }
}
