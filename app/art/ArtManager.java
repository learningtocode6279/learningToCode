package art;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ArtManager {

	private static final List<ArtItem> ART_ITEMS =
			List.of(
					new ArtItem("LITERALLY NOTHING", null, LocalDate.of(2021, Month.MAY, 1))
			);

	private static final LinkedHashMap<LocalDate, List<ArtItem>> ART_ITEM_MAP =
			ART_ITEMS.stream()
				.sorted(Comparator.comparing(ArtItem::getDate))
				.collect(Collectors.groupingBy(ArtItem::getDate, LinkedHashMap::new, Collectors.toList()));

	public static LinkedHashMap<LocalDate, List<ArtItem>> getArtItems()
	{
		LocalDate now = LocalDate.now();
		return ART_ITEM_MAP;
	}
}
