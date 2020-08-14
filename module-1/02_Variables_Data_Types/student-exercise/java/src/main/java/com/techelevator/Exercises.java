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
		
		int playingRaccoons = 3;
		int leavingRaccoons = 2;
		int remainingRaccoons = playingRaccoons - leavingRaccoons;
		System.out.println("3. There are " + remainingRaccoons + " Raccoons left in the woods.");
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		
		int flowers = 5;
		int bees	= 3;
		int lessBeesThanFlowers = flowers - bees;
		System.out.println("4. There are " + lessBeesThanFlowers + " less bees than flowers.");
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		
		int lonelyPigeon = 1;
		int anotherPigeon = 1;
		int	totalPigeonsEatingBreadcrumbs = lonelyPigeon + anotherPigeon;
		System.out.println("5. Now there are " + totalPigeonsEatingBreadcrumbs + " pigeons eating breadcrumbs.");
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		
		int originalSittingOwls = 3;
		int joiningOwls	= 2;
		int totalOwls = originalSittingOwls + joiningOwls;
		System.out.println("6. There are " + totalOwls + " owls on the fence now.");
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		
		int workingBeavers = 2;
		int swimmingBeavers = 1;
		int remainingWorkingBeavers = workingBeavers - swimmingBeavers;
		System.out.println("7. There is " + remainingWorkingBeavers + " beaver still working.");
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		
		int toucansOriginallySitting = 2;
		int toucansJoining = 1;
		int totalToucansSitting = toucansOriginallySitting + toucansJoining;
		System.out.println("8. Total toucans sitting on a tree limb = " + totalToucansSitting);
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		
		int squirrelsInTree = 4;
		int amountOfNuts = 2;
		int squirrelsWithoutNuts = squirrelsInTree - amountOfNuts;
		System.out.println("9. There are " + squirrelsWithoutNuts + " more squirrels than there are nuts.");
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		
		int quarter = 1;
		int dime = 1;
		int nickel = 2;
		float moneyFound = (quarter * 0.25F) + (dime * 0.10F) + (nickel * 0.05F);
		System.out.println("10. Mrs. Hilt found $" + moneyFound);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int mrsBriersMuffins = 18;
		int mrsMacadamsMuffins = 20;
		int mrsFlannerysMuffins = 17;
		int totalMuffinsBaked = mrsBriersMuffins + mrsMacadamsMuffins + mrsFlannerysMuffins;
		System.out.println("11. Total muffins baked by first grade: " + totalMuffinsBaked);
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		
		float yoyoPrice = 0.24F;
		float whistlePrice = 0.14F;
		float totalMoneySpent = yoyoPrice + whistlePrice;
		System.out.println("12. Mrs. Hilt spent $" + totalMoneySpent);
        
		/*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallowsUsed = largeMarshmallows + miniMarshmallows;
		System.out.println("13. Total marshmallows used by Mrs. Hilt: " + totalMarshmallowsUsed);
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int mrsHiltsSnowAmount = 29;
		int brecknockElementarySchoolSnowAmount = 17;
		int snowDifferenceForMrsHilt = mrsHiltsSnowAmount - brecknockElementarySchoolSnowAmount;
		System.out.println("14. Mrs. Hilt's house has " + snowDifferenceForMrsHilt + " more inches of snow than the elementary school.");
        
		/*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		
		int hiltInitialMoney = 10;
		int costOfToyTruck = 3;
		int costOfPencil = 2;
		int totalPurchases = costOfToyTruck + costOfPencil;
		int hiltFinalMoneyRemaining = hiltInitialMoney - totalPurchases;
		System.out.println("15. Mrs. Hilt has " + hiltFinalMoneyRemaining + " dollars left.");
       
		/*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		
		int marblesOwnedOriginally = 16;
		int marblesLost = 7;
		int marblesOwnedNow = marblesOwnedOriginally - marblesLost;
		System.out.println("16. Marbles Josh has now: " + marblesOwnedNow);
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int ownedSeashells = 19;
		int seashellCollectionGoal = 25;
		int seashellsNeeded = seashellCollectionGoal - ownedSeashells;
		System.out.println("17. Megan needs " + seashellsNeeded + " more seashells to get 25 total.");
		
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons;
		System.out.println("18. Green balloons amount = " + greenBalloons);
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnShelf = 38;
		int addedBooksOnShelf = 10;
		int totalBooksOnShelf = booksOnShelf + addedBooksOnShelf;
		System.out.println("19. Total books on the shelf now: " + totalBooksOnShelf);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		
		int beeLegs = 6;
		int totalBees = 8;
		int totalBeesLegs = beeLegs * totalBees;
		System.out.println("20. 8 bees have " + totalBeesLegs + " legs");
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		
		float iceCreamConeCost = 0.99F;
		int conesPurchased = 2;
		float conesCost = iceCreamConeCost * conesPurchased;
		System.out.println("21. 2 ice cream cones cost $" + conesCost);

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int totalRocksRequired = 125;
		int rocksObtained = 64;
		int rocksRemaining = totalRocksRequired - rocksObtained;
		System.out.println("22. Additional rocks needed to complete the border = " + rocksRemaining);
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int ownedMarbles = 38;
		int lostMarbles = 15;
		int remainingMarbles = ownedMarbles - lostMarbles;
		System.out.println("23. Marbles left = " + remainingMarbles);
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int totalDistanceToConcert = 78;
		int completedDrivingDistance = 32;
		int remainingDrivingDistance = totalDistanceToConcert - completedDrivingDistance;
		System.out.println("24. Miles left to drive = " + remainingDrivingDistance);
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */

		int minute = 1;
		int hour = (minute * 60);
		int saturdayMorningTime = (1 * hour) + (30 * minute);
		int saturdayAfternoonTime = (45 * minute);
		int totalTime = saturdayMorningTime + saturdayAfternoonTime;
		int hoursSpent = totalTime / 60;
		int minutesSpent = totalTime % 60;
		System.out.println("25. Mrs. Hilt spent " + hoursSpent + " hours and " + minutesSpent + " minutes shoveling snow on saturday.");
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		int purchasedHotdogs = 6;
		float pricePerHotdog = 0.50F;
		float totalCost = purchasedHotdogs * pricePerHotdog;
		System.out.println("26. Mrs. Hilt paid $" + totalCost);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		int mrsHiltBudget = 50;
		int pricePerPencil = 7;
		int pencilsBought = mrsHiltBudget / pricePerPencil;
		System.out.println("27. Mrs. Hilt bought " + pencilsBought + " pencils.");
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int totalButterfliesSeen = 33;
		int orangeButterflies = 20;
		int redButterflies = totalButterfliesSeen - orangeButterflies;
		System.out.println("28. Mrs. Hilt saw " + redButterflies + " red butterflies.");
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		int moneyGivenToClerk = 100;
		int costOfCandy = 54;
		int changeReceived = moneyGivenToClerk - costOfCandy;
		System.out.println("29. Kate received " + changeReceived + " cents back from the clerk.");
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int existingTrees = 13;
		int potentialAddedTrees = 12;
		int potentialTotalTrees = existingTrees + potentialAddedTrees;
		System.out.println("30. Mark would have a total of " + potentialTotalTrees + " trees.");
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int hoursInDay = 24;
		int totalDaysToGrandma = 2;
		int totalHoursToGrandma = hoursInDay * totalDaysToGrandma;
		System.out.println("31. Joy will see her grandma in " + totalHoursToGrandma + " hours.");
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int totalCousins = 4;
		int piecesOfGumPerCousin = 5;
		int gumNeeded = totalCousins * piecesOfGumPerCousin;
		System.out.println("32. Kim needs " + gumNeeded + " pieces of gum.");
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		float dansMoney = 3.00F;
		float candyBarCost = 1.00F;
		float moneyLeft = dansMoney - candyBarCost;
		System.out.println("33. Dan has $" + moneyLeft);
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnTheLake = 5;
		int peoplePerBoat = 3;
		int totalPeoplePerBoat = boatsOnTheLake * peoplePerBoat;
		System.out.println("34. There are " + totalPeoplePerBoat + " people on boats in the lake");
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int ownedLegos = 380;
		int lostLegos = 57;
		int remainingLegos = ownedLegos - lostLegos;
		System.out.println("35. Ellen has " + remainingLegos + " legos left");
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int bakedMuffins = 35;
		int totalMuffinsNeeded = 83;
		int additionalMuffinsNeeded = totalMuffinsNeeded - bakedMuffins;
		System.out.println("36. Arthur needs to bake " + additionalMuffinsNeeded + " additional muffins.");
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int crayonsDifference = willysCrayons - lucysCrayons;
		System.out.println("37. Willy has " + crayonsDifference + " more crayons than lucy.");
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersPerPage = 10;
		int totalPages = 22;
		int totalStickers = stickersPerPage * totalPages;
		System.out.println("38. I have " + totalStickers + " stickers.");
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int totalCupcakes = 96;
		int numberOfChildren = 8;
		int equalNumberofCupcakes = totalCupcakes / numberOfChildren;
		System.out.println("39. Each child gets " + equalNumberofCupcakes + " cupcakes.");
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int totalCookiesBaked = 47;
		int cookiesPerJar = 6;
		int extraCookiesNotJarred = totalCookiesBaked % cookiesPerJar;
		System.out.println("40. Cookies not placed in a jar = " + extraCookiesNotJarred);
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int totalCroissants = 59;
		int totalNeighbors = 8;
		int extraCroissants = totalCroissants % totalNeighbors;
		System.out.println("41. Croissants left with Marian = " + extraCroissants);
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int cookiesPerTray = 12;
		int cookiesNeededToBake = 276;
		int traysNeeded = cookiesNeededToBake / cookiesPerTray;
		System.out.println("42. Trays needed to bake 276 cookies @ 12 cookies per tray = " + traysNeeded);
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		
		int totalPretzels = 480;
		int pretzelServing = 12;
		int totalServings = totalPretzels / pretzelServing;
		System.out.println("43. Total servings prepared = " + totalServings);

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int totalCupcakesBaked = 53;
		int totalCupcakesLeftHome = 2;
		int totalCupcakesPerBox = 3;
		int boxesGivenAway = (totalCupcakesBaked - totalCupcakesLeftHome) /  totalCupcakesPerBox;
		System.out.println("44. cupcake boxes given away = " + boxesGivenAway);
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int totalCarrotsPrepared = 74;
		int totalGuests = 12;
		int unservedCarrots = totalCarrotsPrepared % totalGuests;
		System.out.println("45. uneaten carrots = " + unservedCarrots);
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int totalTeddyBears = 98;
		int totalTeddysPerShelf = 7;
		int filledShelves = totalTeddyBears / totalTeddysPerShelf;
		System.out.println("46. Shelves that can " + filledShelves);
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int totalPictures = 480;
		int maxPicturesPerAlbum = 20;
		int albumsNeeded = totalPictures / maxPicturesPerAlbum;
		System.out.println("47. Albums needed = " + albumsNeeded);
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int totalCards = 94;
		int maxBoxCapacity = 8;
		int filledBoxes = totalCards / maxBoxCapacity;
		int unfilledBox = totalCards % maxBoxCapacity;
		System.out.println("48. There will be " + filledBoxes + " boxes filled, and " + unfilledBox + " cards in the unfilled box.");
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int totalBooks = 210;
		int totalShelves = 10;
		int booksPerShelf = totalBooks / totalShelves;
		System.out.println("49. Books on each shelf = " + booksPerShelf);
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int totalCroissantsBaked = 17;
		int totalGuestsServed = 7;
		int croissantsPerGuest = totalCroissantsBaked / totalGuestsServed;
		System.out.println("50. Whole Croissants per guest = " + croissantsPerGuest);
		
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		int oneMinute = 1;
		int oneHour = oneMinute * 60;
		int oneRoomWalls = 2 * (12 + 14);
		float billRatePerRoom = (oneRoomWalls) / (2.15F * oneHour);
		float billRatePerHour = billRatePerRoom * oneHour ;
		float jillRatePerRoom = (oneRoomWalls) / (1.90F * oneHour);
		float jillRatePerHour = jillRatePerRoom * oneHour ;
		float combinedRatePerHour = billRatePerHour + jillRatePerHour;
		float fiveRoomsWalls = 5 * oneRoomWalls;
		float timeToCompleteFiveRooms = fiveRoomsWalls / combinedRatePerHour;
		System.out.println("It will take Bill and Jill " + timeToCompleteFiveRooms + " hours to paint the 5 rooms.");
		int bigProjectOfRooms = 623 * oneRoomWalls;
		float timeToCompleteBigProjectInHours = (float) bigProjectOfRooms / combinedRatePerHour;
		int fullShift = 8;
		float daysToCompleteBigProject = (float) timeToCompleteBigProjectInHours / fullShift;
		System.out.println("it will take " + daysToCompleteBigProject + " days");
		
		
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		String firstName = "Karim";
		String middleInitial = "M";
		String lastName = "Eldessouky";
		System.out.println(" \""  + lastName + ", " +  firstName + " " + middleInitial + ".\"");
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		
		int totalDistance = 800;
		int travelledDistance = 537;
		float completedDistance = (float) travelledDistance / totalDistance;
		int completedPercentage = (int)(completedDistance * 100);
		System.out.println(completedPercentage);

		
	}

}
