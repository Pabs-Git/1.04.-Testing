📄 Description

The folder "src" contains the 3 exercises for Level 1 of Java Testing with JUnit. At the end of the folder, you can find all the exercises statements.

💻 Technologies Used

Java 8+ (required for Lambdas and Streams API)

JUnit 5 (for unit testing)

IntelliJ IDEA or any Java IDE for code development

📋 Requirements

Java 8 or higher.

JUnit 5 library.

An IDE such as IntelliJ IDEA or Eclipse for coding.

🛠️ Installation

Clone the repository or download the project folder to your local machine.

Open the project folder in your IDE (such as IntelliJ IDEA).

Ensure that Java 8 or later is set as the SDK in your IDE.

Add JUnit 5 as a dependency if needed.

📌 Exercises

Exercici 1

Crea una classe Java que gestioni una col·lecció de llibres en una biblioteca. La classe ha de permetre:

Afegir llibres a la col·lecció.

Recuperar la llista completa de llibres.

Obtenir el títol d'un llibre donada una posició.

Afegir un llibre en una posició específica.

Eliminar un llibre per títol.

Verifica el seu correcte funcionament amb JUnit:

Verificant que la llista de llibres no és nul·la després de crear un nou objecte.

Confirmant que la llista té una mida esperada després d'inserir diversos llibres.

Assegurant que la llista conté un llibre específic en la seva posició correcta.

Verificant que no hi ha títols de llibres duplicats a la llista.

Comprovant que es pot recuperar el títol d'un llibre donada una posició específica.

Assegurant que afegir un llibre modifica correctament la llista.

Confirmant que eliminar un llibre disminueix la mida de la llista.

Verificant que la llista roman ordenada alfabèticament després d'afegir o eliminar un llibre.

Exercici 2

Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.

Verifica el seu correcte funcionament amb JUnit:

Crea una classe de test parametritzada perquè el test rebi un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.

Exercici 3

Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.

Verifica el seu correcte funcionament amb un test JUnit:

Comprova que la excepció és llançada correctament quan es crida el mètode amb valors inadequats.