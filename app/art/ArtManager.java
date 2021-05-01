package art;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArtManager {

	private static final List<ArtItem> ART_ITEMS =
			List.of(
					new ArtItem("LITERALLY NOTHING", null, LocalDate.of(2021, Month.MAY, 1))
			);

	private static final List<String> BACKGROUND_IMAGES =
			List.of(
				"https://imgur.com/7xb887l.png",
				"https://imgur.com/5aqk4JN.png"
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
