package J_Polymorphism.Example2;

// polymorphism is the method or the mechanism in object oriented programming, that allows actions to act differently
// based on the actual object that the action is being performed on

// If you're inheriting from another class, and you've got a method, and you override that method, that's what polymorphism is

// we are using scope for this explanation:
// create a number of classes, all within this main public class. The advantage of doing this, is only useful if the classes are small and compact.

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
        for(int i=1; i<11; i++) {
            // step 15: create a variable Movie movie and the movie object = randomMovie()
            Movie movie = randomMovie();
            // \n = starts the output on the next line
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n"); // movie.plot is the definition how polymorphism works
            // what it's actually doing: it's looking at the object called movie, the variable that we created, that
            // was returned from the random movie method. And then it's going down and looking into that object and
            // seeing, has it got a plot method?
            // forgetable has no plot and it prints out: 'No plot here' because in the movie class the return said this
        }
    }

    // step 11: method: purpose of this method is to return a random movie
    public static Movie randomMovie() {
        // step 12: in order to be able to return a random movie, we need to generate a random number
        // each time that this method is called, a random movie is selected: math function
        // by default this will return a random number, a double between 0 and 1. So, what we're doing is we're
        // converting that to an integer (int), and then we're multiplying it, in this case, by 5. So, by doing that, that's
        // going to return a random number in the range 0 to 4. And what we're gonna do then is add 1 to that: in other
        // words we're going to return a number between 1 and 5
        int randomNumber = (int) (Math.random() * 5) +1;
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
        // each time we call this random movie method, we should get a random movie returned to us
        // take a look at the fact that we're actually returning the movies
        // the super class in this case, Movie, because all these classes actually inherit from Movie
        // and that's why we can use that once to apply to all these classes
        // because of the way inheritance works we can use that is a relationship: Jaws is a movie,
        // Independence day is a movie etc.
    }
}