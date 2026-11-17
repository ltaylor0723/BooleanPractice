public class ClearScreen {
    //DOESN'T WORK IN IDE
        public static void clear() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
}
