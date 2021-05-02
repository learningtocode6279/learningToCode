package art;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.time.LocalDate.of;

public class ArtManager {

	private static final List<ArtItem> ART_ITEMS =
			List.of(
					new ArtItem("LITERALLY NOTHING", null, null, of(2021, Month.MAY, 1))
			);

	private static final List<String> BACKGROUND_IMAGES =
			List.of(
				"https://imgur.com/7xb887l.png",
				"https://imgur.com/5aqk4JN.png",
				"https://imgur.com/nkArxKI.png",
				"https://imgur.com/EV7wUqT.png",
				"https://imgur.com/c3AIbKB.png",
				"https://imgur.com/x6Ya5KE.png",
				"https://imgur.com/Ixgq4pW.png",
				"https://imgur.com/g42K8o4.png",
				"https://imgur.com/ls4dYGl.png",
				"https://imgur.com/kGv41tN.png",
				"https://imgur.com/lxfWTJz.png",
				"https://imgur.com/Sat6t5G.png",
				"https://imgur.com/S9zEckA.png",
				"https://imgur.com/kIqqh3c.png",
				"https://imgur.com/1JOnlzv.png",
				"https://imgur.com/eKWVICo.png",
				"https://imgur.com/0KQpMcE.png",
				"https://imgur.com/OiVJOBZ.png",
				"https://imgur.com/l0floke.png"
			);

	public static String randomBgUrl()
	{
		Random random = new Random();
		int randomIndex = random.ints(0, BACKGROUND_IMAGES.size())
				.findFirst()
				.getAsInt();
		return BACKGROUND_IMAGES.get(randomIndex);
	}

	private static final LinkedHashMap<LocalDate, List<ArtItem>> ART_ITEM_MAP =
			ART_ITEMS.stream()
				.sorted(Comparator.comparing(ArtItem::getDate))
				.collect(Collectors.groupingBy(ArtItem::getDate, LinkedHashMap::new, Collectors.toList()));

	public static LinkedHashMap<LocalDate, List<ArtItem>> getArtItems()
	{
		return ART_ITEM_MAP;
	}
}
