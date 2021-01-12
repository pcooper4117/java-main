package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
int racoonsPlaying = 3;
int racoonsThatAreHungry = 2;
int racoonsLeft = racoonsPlaying - racoonsThatAreHungry;
System.out.println(racoonsLeft);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
int flowers = 5;
int bees = 3;
int lessBees = flowers - bees;
System.out.println(lessBees);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
int lonelyPigeon = 1;
int hungryPigeon = 1;
int dinnerForTwoBirds = lonelyPigeon + hungryPigeon;
System.out.println(dinnerForTwoBirds);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
int originalOwls = 3;
int newOwls = 2;
int TotalOwls = originalOwls + newOwls;
System.out.println(TotalOwls);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
int workerBeevs = 2;
int wetBeev = 1;
int productiveBeev = workerBeevs - wetBeev;
System.out.println(productiveBeev);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
int treeToucs =  2;
int flyingTouc = 1;
int totalToucs = treeToucs + flyingTouc;
System.out.println(totalToucs);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
int treeSQs = 4;
int nuts =  2;
int moreSquirrels =  treeSQs - nuts;
System.out.println(moreSquirrels);
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
double  quarter = .25;
double dime =  .20;
double nickels =  .05;
double totalMoney = (quarter + dime + nickels);
System.out.println(totalMoney);

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
int MrsBsMuffs = 18;
int MrsMcsMuffs = 20;
int MrsFsMuffs = 17;
int totalMuffs = (MrsBsMuffs + MrsMcsMuffs + MrsFsMuffs );
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
int yoyo = 24;
int whistle = 14;
int total = (yoyo + whistle);
System.out.println(total);


        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
int bigMallos = 8;
int lilMallos = 10;
int totalMallos = (bigMallos + lilMallos);
System.out.println(totalMallos);

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
int hiltSnow = 29;
int schoolSnow = 17;
int totalSnow =  (hiltSnow - schoolSnow);
System.out.println(totalSnow);

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
int hiltsMoney = 10;
int truck = 3;
int pencil = 2;
int leftOver = (hiltsMoney - truck - pencil);
System.out.println(leftOver);

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
int totalMarbs = 16;
int lostMarbs =  7;
int leftoverMarbs = (totalMarbs- lostMarbs);
System.out.println(leftoverMarbs);

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
int wantedShells = 25;
int megansShells = 19;
int neededShells = (wantedShells - megansShells);
System.out.println(neededShells);

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
int totalballoons = 17;
int redBalloons = 8;
int greenBs = (totalballoons - redBalloons);
System.out.println(greenBs);



        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
int booksOnShelf = 38;
int martaBooks =  10;
int totalBooks = (booksOnShelf + martaBooks);
System.out.println(totalBooks);

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
int bee = 6;
int totalBees = 8;
int legs = (bee * bees);
System.out.println(legs);


        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
double  cone = .99;
double totalCost =  (cone + cone);
System.out.println(totalCost);


        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
int Garden =  125;
int mrsH = 64;
int complete = (Garden - mrsH);
System.out.println(complete);

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
int allTheMarbs = 38;
int LostMarbs = 15;
int MarbsLeft = (allTheMarbs - LostMarbs);
System.out.println(MarbsLeft);

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
int totalMiles = 78;
int milesDrove = 32;
int milesLeft = (totalMiles - milesDrove);
System.out.println(milesLeft);


        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
double saturday = 1.5;
double afternoon = .75;
 double totalTime = (saturday + afternoon);
System.out.println(totalTime);

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
double Dogs = 6;
double cost = .50;
double totalCosts = (Dogs * cost);
System.out.println(totalCosts);


        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
double hiltsPurse =  .50;
double pencils = .07;
double totalPencils = (hiltsPurse / pencils);
System.out.println(totalPencils);

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
int totalButterflys = 33;
int orangeFlys = 20;
int redFlys =  (totalButterflys - orangeFlys);
System.out.println(redFlys);

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
double kate  = 1.0;
double candy =  .54;
double change = (kate - candy);
System.out.println(change);

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
int marks = 13;
int moreTrees =  12;
int TotalTrees = (marks + moreTrees);
System.out.println(TotalTrees);

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
int dayHours = 24;
int days = 2;
int Hours = (dayHours * days);
System.out.println(moreSquirrels);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
int cousins = 4;
int gum = 5;
int totalGum = (cousins * gum);
System.out.println(totalGum);


        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
double dan = 3.00;
double candies = 1.00;
double leftOverCash = (dan - candies);
System.out.println(leftOverCash);


        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
int boats = 5;
int peeps = 3;
int totalPeeps = (boats * peeps);
System.out.println(totalPeeps);

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
int legos = 380;
int lost = 57;
int WhatSheGot =( legos - lost);
System.out.println(WhatSheGot);

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
int TotalMuffs = 83;
int bakedMuffs = 35;
int MuffsToMake = ( TotalMuffs - bakedMuffs);
System.out.println(MuffsToMake);

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
int Willy = 1400;
int Lucy = 290;
int difference =  (Willy-Lucy);
System.out.println(difference);


        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
int stickers = 10;
int pages = 22;
int totalSticks = (stickers * pages);
System.out.println(totalSticks);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
int cups = 98;
int kids = 8;
int shared = (cups / kids);
System.out.println(shared);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
int cooks = 47;
int jars = 6;
int howManyCookies = ( cooks % 6);
System.out.println(howManyCookies);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
