# English Idioms Learning Application

A JavaFX desktop application for learning and exploring common English idioms with their meanings and examples.

## Overview

This application provides an interactive way to learn and explore over 1000 commonly used English idioms. Users can browse idioms alphabetically, search for specific idioms, and view detailed explanations with real-world examples. The application is designed to help English learners and enthusiasts understand the colorful expressions that make English such a rich language.

## Features

- **Extensive Idiom Database**: Contains over 1000 English idioms with meanings and usage examples
- **Alphabetical Browsing**: Browse idioms organized alphabetically for easy navigation
- **Search Functionality**: Quickly find specific idioms using the search filter
- **Detailed Information**: Each idiom includes:
  - Definition/meaning
  - Multiple usage examples
  - Alphabet categorization
- **Enhanced UI Experience**: 
  - Modern gradient background
  - Improved styling for all UI elements
  - Better visual feedback and selection highlighting
  - Enhanced typography and spacing
  - Drop shadows and visual effects for depth
  - Welcome message for new users

## Technical Details

### Technologies Used

- **Java 25**: Core programming language
- **JavaFX**: GUI framework for the desktop application
- **Maven**: Build automation and dependency management

### Project Structure

```
src/
├── main/
│   ├── java/com/itsaimao/
│   │   ├── Data.java        # Contains the idiom database
│   │   ├── Idiom.java       # Idiom model class
│   │   ├── Main.java        # Application entry point
│   │   └── MainController.java # GUI controller
│   └── resources/
│       ├── main.css         # Application styling
│       └── main.fxml        # GUI layout
└── test/                    # Test files (if any)
```

### Key Components

1. **Idiom Model (`Idiom.java`)**:
   - Represents an idiom with properties: id, alphabet, idiom text, meaning, and examples
   - Includes proper getter/setter methods and overridden equals/hashCode methods for comparison

2. **Data Management (`Data.java`)**:
   - Contains a comprehensive collection of over 1000 English idioms
   - Provides method to retrieve the idiom list

3. **User Interface (`MainController.java`)**:
   - Manages the ListView for displaying idioms
   - Implements search/filter functionality
   - Handles selection events to display idiom details
   - Updates UI components with idiom information
   - Shows welcome message on startup

## Getting Started

### Prerequisites

- Java 25 Development Kit (JDK)
- Apache Maven 3.6 or higher
- JavaFX SDK (if not included in your JDK)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/EnglishIdioms.git
   ```

2. Navigate to the project directory:
   ```bash
   cd EnglishIdioms
   ```

3. Build the project using Maven:
   ```bash
   mvn clean package
   ```

### Running the Application

After building the project, you can run the application using:

```bash
java -jar target/EnglishIdioms-1.0-SNAPSHOT.jar
```

Or run directly from Maven:
```bash
mvn javafx:run
```

*Note: If JavaFX is not included in your JDK, you may need to add JavaFX dependencies to the module path.*

## Usage

1. **Browse Idioms**: The main window displays a list of idioms in alphabetical order
2. **Search**: Use the filter text field to search for specific idioms by name
3. **View Details**: Click on any idiom in the list to view its:
   - Full expression
   - Detailed meaning
   - Example sentences showing usage in context

## Example Idioms

Here are a few examples of idioms included in the database:

- **"A Piece of Cake"**: Something that is very easy to do
- **"Break the Ice"**: To initiate a conversation in a social setting
- **"Hit the Hay"**: To go to bed, to go to sleep
- **"Spill the Beans"**: To reveal secret or confidential information

Each idiom is accompanied by clear definitions and multiple examples of how to use it in context.

## Customization

You can customize the application in several ways:

1. **Adding New Idioms**: Add to the `IDIOM_LIST` in `Data.java`
2. **Styling**: Modify the `main.css` file to change the appearance
3. **Layout**: Edit the FXML file to rearrange UI components

## Contributing

Contributions to improve the idiom database or enhance the application are welcome:

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

Areas for improvement:
- Adding more idioms to the database
- Improving the UI/UX design
- Adding features like favorites or quizzes
- Implementing multiple language support

## License

This project is open source and available under the [MIT License](LICENSE).

## Acknowledgments

- Idiom definitions and examples compiled from various educational sources
- Special thanks to all contributors who have helped expand the idiom database

---

*This application is designed for educational purposes to help English learners understand and use common idiomatic expressions correctly.*