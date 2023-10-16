package seedu.wildwatch.operation;

import seedu.wildwatch.entry.EntryList;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * This is the Ui class that is in-charge of interaction with the user
 * Represents the user interface of the application.
 * Provides methods to interact with the user and display messages.
 * Prints out appropriate messages such as errors and tasks added
 */
public class Ui {
    private static final int NUMBER_OF_UNDERSCORES = 60;
    private static Scanner in = new Scanner(System.in);

    /**
     * Returns input of the user from the console.
     *
     * @return The user's input as a trimmed string.
     */
    public static String inputRetriever() {
        return in.nextLine().trim();
    }

    public static void helpRequestMessagePrinter() {
        System.out.println("No worries, I'm here to help!");
    }

    public static void listMessagePrinter() {
        System.out.println("Here are the tasks in your list: ");
    }

    public static void entryCountPrinter() {
        System.out.println("Now you have " + (EntryList.getArraySize()) + " entries in the list.");
    }

    public static void unknownInputMessagePrinter() {
        System.out.println("OOPS!!! I'm sorry, but I don't know what that means :-(");
    }

    public static void invalidDateMessagePrinter() {
        System.out.println("OOPS!!! Invalid Date input :-(");
    }

    public static void emptyListMessagePrinter() {
        System.out.println("OOPS!!! Nothing to list. :-(");
    }

    public static void entryNotFoundMessagePrinter() {
        System.out.println("OOPS!!! The entry number could not be found :-(");
    }

    public static void incorrectInputMessagePrinter() {
        System.out.println("OOPS!!! Format of command is incorrect.");
    }

    public static void entryRemovedMessagePrinter() {
        System.out.println("The entry has been removed.");
    }

    public static void entryAddedMessagePrinter() {
        System.out.println("The following entry has been added:");
    }

    public static void emptyDescriptionMessagePrinter(String description) {
        if (description == null) {
            System.out.println("OOPS!!! The description cannot be empty. :-(");
        } else if (description.equals("add")) {
            System.out.println("OOPS!!! The description of an add cannot be empty. :-(");
        } else if (description.equals("delete")) {
            System.out.println("OOPS!!! The description of a delete cannot be empty. :-(");
        } else {
            System.out.println("OOPS!!! The description cannot be empty. :-(");
        }
    }

    public static void printEntry(int nthTask) {
        System.out.print("Date: [" +
                EntryList.getEntryDate(nthTask).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "] | ");
        System.out.print("Species: [" + EntryList.getEntrySpecies(nthTask) + "] | ");
        System.out.print("Name: [" + EntryList.getEntryName(nthTask) + "] | ");
        System.out.print("Remark: [" + EntryList.getEntryRemark(nthTask) + "]");
        System.out.print(System.lineSeparator());
    }

    public static void printHorizontalLines() {
        for (int i = 0; i < NUMBER_OF_UNDERSCORES; i++) {
            System.out.print("_");
        }
        System.out.print(System.lineSeparator());
    }
}


