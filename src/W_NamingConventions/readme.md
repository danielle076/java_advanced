<h3>Naming Conventions</h3>

Java uses CamelCase as a practice for writing names of methods, variables, classes, packages and constants.

<i>Camel case in Java Programming:</i> It consists of compound words or phrases such that each word or abbreviation begins with a capital letter or first word with a lowercase letter, rest all with capital.

<b>1. Classes and Interfaces </b>
* Class names should be <b>nouns</b>, in mixed case with the <b>first</b> letter of each internal word capitalised. Interfaces name should also be capitalised just like class names. 
* Use whole words and avoid acronyms and abbreviations.

        interface Bicycle
        class MountainBike implements Bicyle
        
        interface Sport
        class Football implements Sport

<b>2. Methods</b>
* Methods should be <b>verbs</b>, in mixed case with the <b>first letter lowercase</b> and with the first letter of each internal word capitalised.

        run ();
        runFast();
        getBackground();

<b>3. Variables</b> Variable names should be short yet meaningful.
* Variables can start with either underscore(‘_’) or dollar sign ‘$’ characters, but not recommended.
* Variable names should be short yet meaningful.
* Should be mnemonic i.e, designed to indicate to the casual observer the intent of its use.
* <b>One-character variable names should be avoided</b> except for temporary variables.
* Common names for temporary `variables` are `i`, `j`, `k`, `m`, and `n` for `integers`; `c`, `d`, and `e` for characters.

        int i;
        char c;
        float myWidth;

<b>4. Constant variables</b>
* Should be all uppercase with words separated by underscores (“_”).
* There are various constants used in predefined classes like Float, Long, String etc.

      static final int MIN_WIDTH = 4;
  
* Some  Constant variables used in predefined Float class

        public static final float POSITIVE_INFINITY = 1.0f / 0.0f;
        public static final float NEGATIVE_INFINITY = -1.0f / 0.0f;
        public static final float NaN = 0.0f / 0.0f;

<b>5. Packages</b>
* The prefix of a unique package name is always written in all-lowercase ASCII letters and should be one of the top-level domain names, like com, edu, gov, mil, net, org.
* Subsequent components of the package name vary according to an organisation’s own internal naming conventions.

        com.sun.eng
        com.apple.quicktime.v2
        java.lang
