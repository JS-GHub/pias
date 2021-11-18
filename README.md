# Project Pias

## How to contribute for this project

**1. Clone this repository to your desired directory**

```bash
cd <path_to_desired_directory>
git clone https://github.com/JS-GHub/pias
```

**2. Code away!**

**3. Commit your changes**

```bash
git commit -m <brief description of your changes>
```

>   Don't forget to leave useful comments with your code!

## Code Style

*   Indentation is 2 spaces.
*   Always leave a space before opening a curly bracket.
*   Make a new line after closing a curly bracket only if the following instruction is not related to the previous. Otherwise, leave a space after closing it.
*   Always leave a space before opening parenthesis, unless the parenthesis indicate a method argument.

Example:

```java
public class StyleTest {
  
  /**
   * @param args command line arguments.
   */
  public static void main(String[] args) {
    /** 
     * Eliminate whitespace from the beginning of t.
     * <Second line of a permanent comment>
     */
    while (t.length() != 0 && isWhitespace(t.charAt(0))) {
      t = t.substring(1);
    }

    /** Permanent comment with one line */
    if (t.length() == 0) {
      return false;
    } else {
      //TODO: Implement else
      //Another temporary comment indicating TODOs, FIXMEs, etc.
    }
  }

  /**
   * Maybe add a brief description of the method.
   * 
   * @param s1 first string.
   * @param s2 second string.
   * @return concatenation of s1 and s2
   */
  public String anotherMethod(String s1, String s2) {
    return s1+s2;
  }

}
```

