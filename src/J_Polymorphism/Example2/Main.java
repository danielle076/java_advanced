package J_Polymorphism.Example2;

// step 1: class Movie
class Movie {
    // step 2: variable
    private String name;

    // step 3: constructor
    public Movie(String name) {
        this.name = name;
    }

    // step 4: method plot
    public String plot() {
        return "No plot here";
    }

    // step 5: getter
    public String getName() {
        return name;
    }
}

// step 6: class Jaws is inheritance from Movie
class Jaws extends Movie {
    // constructor
    public Jaws() {
        super("Jaws");
    }

    // method
    public String plot() {
        return "A shark eats lots of people";
    }
}

// step 7: class IndependenceDay is inheritance from Movie
class IndependenceDay extends Movie {
    // constructor
    public IndependenceDay() {
        super("Independence Day");
    }

    // method using override
    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

// step 8: class MazeRunner is inheritance from Movie
class MazeRunner extends Movie {
    // constructor
    public MazeRunner() {
        super("Maze Runner");
    }

    // method using override
    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

// step 9: class StarWars is inheritance from Movie
class StarWars extends Movie {
    // constructor
    public StarWars() {
        super("Star Wars");
    }

    // method using override
    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

// step 10: class Forgetable is inheritance from Movie
class Forgetable extends Movie {
    // constructor
    public Forgetable() {
        super("Forgetable");
    }

    // no plot method
    // this one makes sense how polymorphism works
}

public class Main {

    public static void main(String[] args) {
        // step 14: for loop that goes through a number of times retrieving a random movie and then start using that polymorphism:
        // to actually call the relevant plot method for that class
        for (int i = 1; i < 11; i++) {
            // step 15: create a variable Movie movie and the movie object = randomMovie()
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n"); // movie.plot is the definition how polymorphism works
        }
    }

    // step 11: method: purpose of this method is to return a random movie
    public static Movie randomMovie() {
        // step 12: in order to be able to return a random movie, we need to generate a random number
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        // step 13: create the movie classes with switch
        switch (randomNumber) {
            case 1:
                return new Jaws();
            // no break needed, because we've got a return in there as the first line
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }
    }
}