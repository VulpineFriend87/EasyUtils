
<p align="center">
    <img src="https://i.postimg.cc/Vkx0yGJB/Easy.png" alt="EasyUtils">
</p>

---
# EasyUtils

Spice up your projects with this easy-to-use API.

## Import the API in your project
### Maven
```
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```
```
<dependency>
    <groupId>com.github.VulpineFriend87</groupId>
    <artifactId>EasyUtils</artifactId>
    <version>LASTEST-VERSION</version>
</dependency>
```
### Gradle
```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
```
dependencies {
        implementation 'com.github.VulpineFriend87:EasyUtils:LASTEST-VERSION'
}
```

## How to use
### EasyItem
This is an easier way of making ItemStacks, which are normally really painful to create (5+ lines of code), but now with `EasyItems`, it becomes much simpler. You will just need 2 (or even 1) lines of code to make a functional ItemStack. In this example, I created a chest ItemStack.
```
EasyItem item = new EasyItem(Material.CHEST, "&cSuper Chest!", Arrays.asList("&7Line 1!", "&7Line 2!"));
ItemStack itemStack = item.getItemStack();
// In the EasyItem, we provided a Material, a displayName, and a Lore (which is a List<String>). I used Arrays.asList just to avoid creating a separate variable, but you can do it as you like.
```
I'm planning on adding more features in upcoming versions, like enchants to the item and much more.

### EasyGUI
`EasyGUI` is an easier way of making Inventories. It is based on `EasyItems`, which makes it even easier to use without having to create all of the ItemStacks manually. In this example, I created a basic inventory with a sword and an axe.
```
EasyGUI gui = new EasyGUI("&aSuper GUI!", 10);
// We provided the title and the size of the GUI.

gui.addItem(new EasyItem(Material.DIAMOND_SWORD, "&aSuper Sword!", Arrays.asList("&7Line 1!", "&7Line 2!")), 0);
// We provided the EasyItem and the slot the item has to be put in.

gui.addItem(new EasyItem(Material.DIAMOND_AXE, "&aSuper Axe!", Arrays.asList("&7Line 1!", "&7Line 2!")), 9);

Inventory inventory = gui.getInventory();
```

### EasyMessage
`EasyMessage` allows you to create clickable and hoverable messages with ease. You can initialize it with a message and set click and hover events easily. Here's a simple usage example:
```
EasyMessage message = new EasyMessage("&aClick me!");
message.setClickable(ClickEvent.Action.OPEN_URL, "https://example.com");
message.setHoverable(HoverEvent.Action.SHOW_TEXT, "&7This link will open a website.");
TextComponent textComponent = message.getTextComponent();
```

### Colorize
`Colorize` provides utility methods for coloring messages with both standard color codes and hex color codes. It allows you to translate strings, `String[]`, and `List<String>` into colored text.

Here’s how you can use it:
```
// Color a single string
String coloredMessage = Colorize.color("&cThis is red!");

// Color a String array
String[] messages = {"&aThis is green!", "&bThis is blue!"};
String[] coloredMessages = Colorize.color(messages);

// Color a List<String>
List<String> lore = Arrays.asList("&7Line 1", "&7Line 2");
List<String> coloredLore = Colorize.color(lore);
```

That's all for now; stay tuned for cool updates!