
public class BeerSong {

	public static void main(String[] args) {
        BeerSong beerSong = new BeerSong();
		beerSong.ninetyNineBottlesOfBeer();
	}

	void ninetyNineBottlesOfBeer() {
        int beerNum = 99;
		String word = "bottles";
		while (beerNum > 0) {
			System.out.println(beerNum + " " + word + " of beer on the wall," + beerNum + " " + word + " of beer.");
			System.out.println("Take one down, pass it around.");

			beerNum = beerNum - 1;
			if (beerNum == 1) {
				word = "bottle";
			}
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
				System.out.println("-----------------------------");
			} else {
				System.out.println("No more bottles of beer on the wall");
			}
		}
	}
}
