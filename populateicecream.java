import java.util.ArrayList;

public class populateicecream {
    public static void pop(ArrayList<icecreamflavor> icecreaminventory){
        icecreamflavor PartyCake = new icecreamflavor();
        icecreamflavor ChocolateChipCookie = new icecreamflavor();
        icecreamflavor CookiesAndCream = new icecreamflavor();
        icecreamflavor CottonCandy = new icecreamflavor();
        icecreamflavor ChocolatePeanutButter = new icecreamflavor();
        icecreamflavor BlackRaspberry = new icecreamflavor();
        icecreamflavor ButterPecan = new icecreamflavor();
        icecreamflavor CookieDough = new icecreamflavor();
        icecreamflavor Mint = new icecreamflavor();
        icecreamflavor Coffee = new icecreamflavor();
        icecreamflavor Mochachino = new icecreamflavor();
        icecreamflavor Pistachio = new icecreamflavor();
        icecreamflavor Nutterbutter = new icecreamflavor();
        icecreamflavor Moosetracks = new icecreamflavor();
        icecreamflavor VanillaPeanutButter = new icecreamflavor();
        icecreamflavor Banana = new icecreamflavor();
        icecreamflavor BlueberryPie = new icecreamflavor();
        icecreamflavor RumRaisin = new icecreamflavor();
        icecreamflavor RainbowSherbet = new icecreamflavor();
        icecreamflavor CherryVanilla = new icecreamflavor();
        icecreamflavor VanillaChip = new icecreamflavor();
        icecreamflavor SweetAndSalty = new icecreamflavor();
        icecreamflavor ToastedCoconut = new icecreamflavor();
        icecreamflavor Chocolate = new icecreamflavor();
        icecreamflavor Vanilla = new icecreamflavor();
        icecreamflavor Strawberry = new icecreamflavor();
        icecreamflavor RockyRoad = new icecreamflavor();
        icecreamflavor JerseyShore = new icecreamflavor();
        icecreamflavor MidnightJerseyShore = new icecreamflavor();
        icecreamflavor ChocSoftServe = new icecreamflavor();
        icecreamflavor VanSoftServe = new icecreamflavor();
        icecreamflavor PineappleDole = new icecreamflavor();
        icecreamflavor StrawberryDole = new icecreamflavor();

        icecreaminventory.add(PartyCake);
            PartyCake.setName("Party Cake");
            PartyCake.setDescription("Birthday!");
            PartyCake.setVendor("Arctic Ice Cream");
            PartyCake.setInStock(false);
            PartyCake.setStandardAmount(2);
            PartyCake.setPrice(65);
            PartyCake.setPeanut(false);
            PartyCake.setMilk(true);
            PartyCake.setTreeNuts(false);
            PartyCake.setWheat(true);
            PartyCake.setSoy(true);
        icecreaminventory.add(ChocolateChipCookie);
            ChocolateChipCookie.setName("Chocolate Chip Cookie");
            ChocolateChipCookie.setDescription("Brown sugar ice cream with mini chocolate chips!");
            ChocolateChipCookie.setVendor("Arctic Ice Cream");
            ChocolateChipCookie.setInStock(true);
            ChocolateChipCookie.setStandardAmount(4);
            ChocolateChipCookie.setPrice(65);
            ChocolateChipCookie.setPeanut(false);
            ChocolateChipCookie.setMilk(true);
            ChocolateChipCookie.setTreeNuts(false);
            ChocolateChipCookie.setWheat(false);
            ChocolateChipCookie.setSoy(true);
        icecreaminventory.add(CookiesAndCream);
            CookiesAndCream.setName("Cookies and Cream");
            CookiesAndCream.setDescription("Sweet cream ice cream with crushed oreo pieces!");
            CookiesAndCream.setVendor("Arctic Ice Cream");
            CookiesAndCream.setInStock(true);
            CookiesAndCream.setStandardAmount(6);
            CookiesAndCream.setPeanut(false);
            CookiesAndCream.setMilk(true);
            CookiesAndCream.setTreeNuts(false);
            CookiesAndCream.setWheat(true);
            CookiesAndCream.setSoy(true);
        icecreaminventory.add(CottonCandy);
            CottonCandy.setName("Cotton Candy");
            CottonCandy.setDescription("Just like the fair!");
            CottonCandy.setVendor("Jack and Jill");
            CottonCandy.setInStock(false);
            CottonCandy.setStandardAmount(2);
            CottonCandy.setPrice(60);
            CottonCandy.setPeanut(false);
            CottonCandy.setMilk(true);
            CottonCandy.setTreeNuts(false);
            CottonCandy.setWheat(false);
            CottonCandy.setSoy(true);
        icecreaminventory.add(ChocolatePeanutButter);
            ChocolatePeanutButter.setName("Chocolate Peanut Butter");
            ChocolatePeanutButter.setDescription("Rich chocolate base with a hard peanut butter ripple!");
            ChocolatePeanutButter.setVendor("Arctic Ice Cream");
            ChocolatePeanutButter.setInStock(true);
            ChocolatePeanutButter.setStandardAmount(4);
            ChocolatePeanutButter.setPrice(60);
            ChocolatePeanutButter.setPeanut(true);
            ChocolatePeanutButter.setMilk(true);
            ChocolatePeanutButter.setTreeNuts(false);
            ChocolatePeanutButter.setWheat(false);
            ChocolatePeanutButter.setSoy(false);
        icecreaminventory.add(BlackRaspberry);
            BlackRaspberry.setName("Black Raspberry");
            BlackRaspberry.setDescription("Fresh and seasonal, locally sourced");
            BlackRaspberry.setVendor("Arctic Ice Cream");
            BlackRaspberry.setInStock(true);
            BlackRaspberry.setStandardAmount(2);
            BlackRaspberry.setPrice(60);
            BlackRaspberry.setPeanut(false);
            BlackRaspberry.setMilk(true);
            BlackRaspberry.setTreeNuts(false);
            BlackRaspberry.setWheat(false);
            BlackRaspberry.setSoy(false);
        icecreaminventory.add(ButterPecan);
            ButterPecan.setName("Butter Pecan");
            ButterPecan.setDescription("Classic!");
            ButterPecan.setVendor("Arctic Ice Cream");
            ButterPecan.setInStock(false);
            ButterPecan.setStandardAmount(2);
            ButterPecan.setPrice(60);
            ButterPecan.setPeanut(false);
            ButterPecan.setMilk(true);
            ButterPecan.setTreeNuts(true);
            ButterPecan.setWheat(false);
            ButterPecan.setSoy(false);
        icecreaminventory.add(CookieDough);
            CookieDough.setName("Cookie Dough");
            CookieDough.setDescription("Sweet cream ice cream with mini cookie dough chunks!");
            CookieDough.setVendor("Arctic Ice Cream");
            CookieDough.setInStock(true);
            CookieDough.setStandardAmount(4);
            CookieDough.setPrice(65);
            CookieDough.setPeanut(false);
            CookieDough.setMilk(true);
            CookieDough.setTreeNuts(false);
            CookieDough.setWheat(true);
            CookieDough.setSoy(true);
        icecreaminventory.add(Mint);
            Mint.setName("Mint Chocolate Chips");
            Mint.setDescription("Green mint ice cream with mini chocolate chunks!");
            Mint.setVendor("Arctic Ice Cream");
            Mint.setInStock(true);
            Mint.setStandardAmount(6);
            Mint.setPrice(60);
            Mint.setPeanut(false);
            Mint.setMilk(true);
            Mint.setTreeNuts(false);
            Mint.setWheat(false);
            Mint.setSoy(false);
        icecreaminventory.add(Coffee);
            Coffee.setName("Coffee");
            Coffee.setDescription("Classic (contians caffeine)!");
            Coffee.setVendor("Arctic Ice Cream");
            Coffee.setInStock(true);
            Coffee.setStandardAmount(4);
            Coffee.setPrice(60);
            Coffee.setPeanut(false);
            Coffee.setMilk(true);
            Coffee.setTreeNuts(false);
            Coffee.setWheat(false);
            Coffee.setSoy(false);
        icecreaminventory.add(Mochachino);
            Mochachino.setName("Mochachino");
            Mochachino.setDescription("Coffee and rich chocolate swirled together!");
            Mochachino.setVendor("Arctic Ice Cream");
            Mochachino.setInStock(false);
            Mochachino.setStandardAmount(2);
            Mochachino.setPrice(60);
            Mochachino.setPeanut(false);
            Mochachino.setMilk(true);
            Mochachino.setTreeNuts(false);
            Mochachino.setWheat(false);
            Mochachino.setSoy(false);
        icecreaminventory.add(Pistachio);
            Pistachio.setName("Pistachio");
            Pistachio.setDescription("Classic (pistachio almondine)!");
            Pistachio.setVendor("Arctic Ice Cream");
            Pistachio.setInStock(true);
            Pistachio.setStandardAmount(2);
            Pistachio.setPrice(60);
            Pistachio.setPeanut(false);
            Pistachio.setMilk(true);
            Pistachio.setTreeNuts(true);
            Pistachio.setWheat(false);
            Pistachio.setSoy(false);
        icecreaminventory.add(Nutterbutter);
            Nutterbutter.setName("Nutterbutter");
            Nutterbutter.setDescription("Peanut butter ice cream with wafer bits!");
            Nutterbutter.setVendor("Arctic Ice Cream");
            Nutterbutter.setInStock(false);
            Nutterbutter.setStandardAmount(2);
            Nutterbutter.setPrice(65);
            Nutterbutter.setPeanut(true);
            Nutterbutter.setMilk(true);
            Nutterbutter.setTreeNuts(false);
            Nutterbutter.setWheat(true);
            Nutterbutter.setSoy(false);
        icecreaminventory.add(Moosetracks);
            Moosetracks.setName("Moosetracks");
            Moosetracks.setDescription("Vanilla ice cream with a fudge swirl and mini peanut butter cups!");
            Moosetracks.setVendor("Arctic Ice Cream");
            Moosetracks.setInStock(true); 
            Moosetracks.setStandardAmount(2);
            Moosetracks.setPrice(65);
            Moosetracks.setPeanut(true);
            Moosetracks.setMilk(true);
            Moosetracks.setTreeNuts(false);
            Moosetracks.setWheat(false);
            Moosetracks.setSoy(true);
        icecreaminventory.add(VanillaPeanutButter);
            VanillaPeanutButter.setName("Vanilla Peanut Butter");
            VanillaPeanutButter.setDescription("Vanilla ice cream with a hard peanut butter ripple!");
            VanillaPeanutButter.setVendor("Arctic Ice Cream");
            VanillaPeanutButter.setInStock(true);
            VanillaPeanutButter.setStandardAmount(4);
            VanillaPeanutButter.setPrice(60);
            VanillaPeanutButter.setPeanut(true);
            VanillaPeanutButter.setMilk(true);
            VanillaPeanutButter.setTreeNuts(false);
            VanillaPeanutButter.setWheat(false);
            VanillaPeanutButter.setSoy(false);
        icecreaminventory.add(Banana);
            Banana.setName("Banana");
            Banana.setDescription("Classic!");
            Banana.setVendor("Arctic Ice Cream");
            Banana.setInStock(true);
            Banana.setStandardAmount(2);
            Banana.setPrice(60);
            Banana.setPeanut(false);
            Banana.setMilk(true);
            Banana.setTreeNuts(false);
            Banana.setWheat(false);
            Banana.setSoy(false);
        icecreaminventory.add(BlueberryPie);
            BlueberryPie.setName("Blueberry Pie");
            BlueberryPie.setDescription("Sweet cream ice cream with a graham cracker swirl and crushed blueberries!");
            BlueberryPie.setVendor("Arctic Ice Cream");
            BlueberryPie.setInStock(false);
            BlueberryPie.setStandardAmount(2);
            BlueberryPie.setPrice(65);
            BlueberryPie.setPeanut(false);
            BlueberryPie.setMilk(true);
            BlueberryPie.setTreeNuts(false);
            BlueberryPie.setWheat(true);
            BlueberryPie.setSoy(true);
        icecreaminventory.add(RumRaisin);
            RumRaisin.setName("Rum Raisin");
            RumRaisin.setDescription("Rum infused base with raisins!");
            RumRaisin.setVendor("Arctic Ice Cream");
            RumRaisin.setInStock(false);
            RumRaisin.setStandardAmount(2);
            RumRaisin.setPrice(60);
            RumRaisin.setPeanut(false);
            RumRaisin.setMilk(true);
            RumRaisin.setTreeNuts(false);
            RumRaisin.setWheat(false);
            RumRaisin.setSoy(false);
        icecreaminventory.add(RainbowSherbet);
            RainbowSherbet.setName("Rainbow Sherbet");
            RainbowSherbet.setDescription("Raspberry, Orange, and Lime swirled!");
            RainbowSherbet.setVendor("Arctic Ice Cream");
            RainbowSherbet.setInStock(true);
            RainbowSherbet.setStandardAmount(4);
            RainbowSherbet.setPrice(65);
            RainbowSherbet.setPeanut(false);
            RainbowSherbet.setMilk(true);
            RainbowSherbet.setTreeNuts(false);
            RainbowSherbet.setWheat(false);
            RainbowSherbet.setSoy(false);
        icecreaminventory.add(CherryVanilla);
            CherryVanilla.setName("Cherry Vanilla");
            CherryVanilla.setDescription("Cherry-infused vanilla icec cream with cherry chunks!");
            CherryVanilla.setPeanut(false);
            CherryVanilla.setMilk(true);
            CherryVanilla.setTreeNuts(false);
            CherryVanilla.setWheat(false);
            CherryVanilla.setSoy(false);
            CherryVanilla.setStandardAmount(2);
        icecreaminventory.add(VanillaChip);
            VanillaChip.setName("Vanilla Chip");
            VanillaChip.setDescription("Vanilla ice cream with mini chocolate chips!");
            VanillaChip.setVendor("Arctic Ice Cream");
            VanillaChip.setInStock(false);
            VanillaChip.setStandardAmount(2);
            VanillaChip.setPrice(60);
            VanillaChip.setPeanut(false);
            VanillaChip.setMilk(true);
            VanillaChip.setTreeNuts(false);
            VanillaChip.setWheat(false);
            VanillaChip.setSoy(false);
        icecreaminventory.add(SweetAndSalty);
            SweetAndSalty.setName("Sweet and Salty");
            SweetAndSalty.setDescription("Vanilla ice cream with a salted caramel swirl and pretzel pieces!");
            SweetAndSalty.setVendor("Arctic Ice Cream");
            SweetAndSalty.setInStock(false);
            SweetAndSalty.setStandardAmount(4);
            SweetAndSalty.setPrice(65);
            SweetAndSalty.setPeanut(false);
            SweetAndSalty.setMilk(true);
            SweetAndSalty.setTreeNuts(false);
            SweetAndSalty.setWheat(false);
            SweetAndSalty.setSoy(true);
        icecreaminventory.add(ToastedCoconut);
            ToastedCoconut.setName("Toasted Coconut");
            ToastedCoconut.setDescription("Coconut ice cream with chocolate-covered coconut flakes!");
            ToastedCoconut.setVendor("Arctic Ice Cream"); //GIFFORDS
            ToastedCoconut.setInStock(true);
            ToastedCoconut.setStandardAmount(4);
            ToastedCoconut.setPrice(65);
            ToastedCoconut.setPeanut(false);
            ToastedCoconut.setMilk(true);
            ToastedCoconut.setTreeNuts(true);
            ToastedCoconut.setWheat(false);
            ToastedCoconut.setSoy(false);
        icecreaminventory.add(Chocolate);
            Chocolate.setName("Chocolate");
            Chocolate.setDescription("Classic!");
            Chocolate.setVendor("Arctic Ice Cream");
            Chocolate.setInStock(true);
            Chocolate.setStandardAmount(6);
            Chocolate.setPrice(55);
            Chocolate.setPeanut(false);
            Chocolate.setMilk(true);
            Chocolate.setTreeNuts(false);
            Chocolate.setWheat(false);
            Chocolate.setSoy(false);
        icecreaminventory.add(Vanilla);
            Vanilla.setName("Vanilla");
            Vanilla.setDescription("Classic!");
            Vanilla.setVendor("Arctic Ice Cream");
            Vanilla.setInStock(true);
            Vanilla.setStandardAmount(6);
            Vanilla.setPrice(55);
            Vanilla.setPeanut(false);
            Vanilla.setMilk(true);
            Vanilla.setTreeNuts(false);
            Vanilla.setWheat(false);
            Vanilla.setSoy(false);
        icecreaminventory.add(Strawberry);
            Strawberry.setName("Strawberry");
            Strawberry.setDescription("Classic!");
            Strawberry.setVendor("Arctic Ice Cream");
            Strawberry.setInStock(true);
            Strawberry.setStandardAmount(4);
            Strawberry.setPrice(55);
            Strawberry.setPeanut(false);
            Strawberry.setMilk(true);
            Strawberry.setTreeNuts(false);
            Strawberry.setWheat(false);
            Strawberry.setSoy(false);
        icecreaminventory.add(RockyRoad);
            RockyRoad.setName("Rocky Road");
            RockyRoad.setDescription("Chocolate ice cream with a marshmallow swirl and chopped peanuts!");
            RockyRoad.setVendor("Arctic Ice Cream");
            RockyRoad.setInStock(false);
            RockyRoad.setStandardAmount(2);
            RockyRoad.setPrice(65);
            RockyRoad.setPeanut(true);
            RockyRoad.setMilk(true);
            RockyRoad.setTreeNuts(false);
            RockyRoad.setWheat(false);
            RockyRoad.setSoy(true);
        icecreaminventory.add(JerseyShore);
            JerseyShore.setName("Jersey Shore");
            JerseyShore.setDescription("Vanilla ice cream with a salted caramel swirl!");
            JerseyShore.setVendor("Arctic Ice Cream");
            JerseyShore.setInStock(true);
            JerseyShore.setStandardAmount(4);
            JerseyShore.setPrice(65);
            JerseyShore.setPeanut(false);
            JerseyShore.setMilk(true);
            JerseyShore.setTreeNuts(false);
            JerseyShore.setWheat(false);
            JerseyShore.setSoy(false);
        icecreaminventory.add(MidnightJerseyShore);
            MidnightJerseyShore.setName("Midnight Jersey Shore");
            MidnightJerseyShore.setDescription("Chocolate ice cream with a salted caramel swirl and brownie pieces!");
            MidnightJerseyShore.setVendor("Arctic Ice Cream");
            MidnightJerseyShore.setInStock(true);
            MidnightJerseyShore.setStandardAmount(4);
            MidnightJerseyShore.setPrice(65);
            MidnightJerseyShore.setPeanut(false);
            MidnightJerseyShore.setMilk(true);
            MidnightJerseyShore.setTreeNuts(false);
            MidnightJerseyShore.setWheat(false);
            MidnightJerseyShore.setSoy(false);
        icecreaminventory.add(ChocSoftServe);
            ChocSoftServe.setName("Chocolate Soft Serve");
            ChocSoftServe.setDescription("Classic!");
            ChocSoftServe.setVendor("Panza");
            ChocSoftServe.setInStock(true);
            ChocSoftServe.setStandardAmount(20);
            ChocSoftServe.setPrice(60);
            ChocSoftServe.setPeanut(false);
            ChocSoftServe.setMilk(true);
            ChocSoftServe.setTreeNuts(true);
            ChocSoftServe.setWheat(false);
            ChocSoftServe.setSoy(false);
        icecreaminventory.add(VanSoftServe);
            VanSoftServe.setName("Vanilla Soft Serve");
            VanSoftServe.setDescription("Classic!");
            VanSoftServe.setVendor("Panza");
            VanSoftServe.setInStock(true);
            VanSoftServe.setStandardAmount(24);
            VanSoftServe.setPrice(60);
            VanSoftServe.setPeanut(false);
            VanSoftServe.setMilk(true);
            VanSoftServe.setTreeNuts(true);
            VanSoftServe.setWheat(false);
            VanSoftServe.setSoy(false);
        icecreaminventory.add(PineappleDole);
            PineappleDole.setName("Pineapple Dole Whip");
            PineappleDole.setDescription("Vegan soft serve alternative");
            PineappleDole.setVendor("Panza");
            PineappleDole.setInStock(true);
            PineappleDole.setStandardAmount(4);
            PineappleDole.setPrice(90);
            PineappleDole.setPeanut(false);
            PineappleDole.setMilk(false);
            PineappleDole.setTreeNuts(false);
            PineappleDole.setWheat(false);
            PineappleDole.setSoy(false);
        icecreaminventory.add(StrawberryDole);
            StrawberryDole.setName("Strawberry Dole Whip");
            StrawberryDole.setDescription("Vegan soft serve alternative");
            StrawberryDole.setVendor("Panza");
            StrawberryDole.setInStock(true);
            StrawberryDole.setStandardAmount(4);
            StrawberryDole.setPrice(90);
            StrawberryDole.setPeanut(false);
            StrawberryDole.setMilk(false);
            StrawberryDole.setTreeNuts(false);
            StrawberryDole.setWheat(false);
            StrawberryDole.setSoy(false);
    }
}