package HomeWorkLesson04;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkLesson04 {
    //Вдумчиво записывал параллельно с видео урока ставя на паузу чтобы разобраться в коде
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static int gameLevel;

    public static char player = '@';
    public static int positionX;
    public static int positionY;
    public static int playerHP = 100;
    public static int scorePlayerSteps = 1;

    public static final int up = 2;
    public static final int down = 4;
    public static final int left = 1;
    public static final int right = 3;

    public static char emptyCell = '_';
    public static char readyCell = '*';


    public static char enemy = 'X';
    public static int enemyDamage;
    public static int enemyDamageMin = 10;
    public static int enemyDamageMax = 20;

    public static char[][] map;
    public static char[][] invisibleMap;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapSizeMin = 4;
    public static int mapSizeMax = 4;


    public static void main(String[] args) {
        initMap();
        createPlayer();
        createEnemy();
        printMap();
        movePlayer();
         //Почему то не распечатывается карта после move player

        //Enemy count:2 | Enemy damage:19
        //===== ACTUAL MAP =====
        //_ | _ | _ | _ |
        //_ | _ | _ | _ |
        //_ | _ | _ | _ |
        //_ | _ | _ | @ |
        //======================
        //Enter the number of your move (up=2,left=1,right=3,down=4
        //2
        //Player moved to [3:2] success
        //Enter the number of your move (up=2,left=1,right=3,down=4


        printMap();


    }

    public static void initMap() {
        mapHeight = randomRange(mapSizeMin, mapSizeMax);
        mapWidth = randomRange(mapSizeMin, mapSizeMax);
        map = new char[mapWidth][mapHeight];
        invisibleMap = new char[mapHeight][mapWidth];
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                map[x][y] = emptyCell;

            }

        }


        System.out.println("Create map > size" + mapWidth + "x" + mapHeight);
    }

    public static int randomRange(int min, int max) {
        return random.nextInt(max - min + 1) + min;


    }


    public static void printMap() {
        System.out.println("===== ACTUAL MAP =====");
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + " | ");
            }
            System.out.println();
        }
        System.out.println("======================");

    }
    public static void createPlayer() {
     positionX = randomRange(0,mapWidth - 1);
     positionY =  randomRange(0,mapHeight - 1);
     map[positionX][positionY] = player;
    }
    public static void movePlayer(){
        int currentX = positionX;
        int currentY = positionY;
        int playerDestination;


        do {
            System.out.println("Enter the number of your move (up=2,left=1,right=3,down=4");
            playerDestination = scanner.nextInt();

            switch (playerDestination) {
                case up:
                    positionY -= 1;
                    break;
                case down:
                    positionY += 1;
                    break;
                case left:
                    positionX -= 1;
                    break;
                case right:
                    positionX += 1;
                    break;
            }
        } while (validNextMove(currentX,currentY,positionX,positionY));
        map[positionX][positionY] = player;
        map[currentX][currentY] = readyCell;
        scorePlayerSteps ++;
    }
    public static boolean validNextMove(int currentX, int currentY, int nextX, int nextY){
        if (nextX >= 0 && nextY < mapHeight && nextX >= 0 && nextX < mapWidth) {
            System.out.println("Player moved to [" + nextX + ":" + nextY + "] success");
            return true;
        } else {
            positionX = currentX;
            positionY = currentY;
        System.out.println("Invalid move. please try again");
        return false;

        }

    }
    public static void createEnemy() {
        enemyDamage = randomRange(enemyDamageMin,enemyDamageMax);
        int x;
        int y;
        int enemyCount = (mapWidth + mapHeight) / 4;
        for (int i = 0; i < enemyCount; i++) {
            do {
                x = random.nextInt(mapWidth);
                y = random.nextInt(mapHeight);
            } while (x == positionX && y == positionY);
            invisibleMap[y][x] = enemy;
        }
        System.out.println("Enemy count:" + enemyCount + " | Enemy damage:" + enemyDamage);
    }
    public  static boolean death(){
        return playerHP > 0;

    }
}