# EasyUtils

Spice up your projects with this easy-to-use api.

## Maven
### Repository
```
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```
### Dependency
```
<dependency>
    <groupId>com.github.VulpineFriend87</groupId>
    <artifactId>EasyUtils</artifactId>
    <version>LASTEST-VERSION</version>
</dependency>
```
## How to use
### EasyItem
This is an easier way of making ItemStacks, that are normally really painful to make (5+ lines of code), but now with EasyItems it becomes a lot simpler. You will just need 2 (or even 1) lines of code to make a functional ItemStack. In this example I created  a chest ItemStack.
```
EasyItem item = new EastItem(Material.CHEST, "&cSuper Chest!", Arrays.asList("&7Line 1!", "&7Line 2!"));
ItemStack itemStack = item.getItemStack();
// In the EasyItem we provided a Material, a displayName and a Lore (wich is a List<String>. I used Arrays.asList just to not make a separate variable, but you can do it as you like).
```
I'm planning on adding more features in upcoming versions, like enchants to the item and much more.

### EasyGUI
EasyGUI is an easier way of making Inventories. It is based on EasyItems, wich makes it even easier to use with out making all of the ItemStacks manually. In this example, I created a basic inventory with a sword and an axe.
```
EasyGUI gui = new EasyGUI("&aSuper GUI!", 10);
// We provided the title and the size of the GUI.

gui.addItem(new EasyItem(Material.DIAMOND_SWORD, "&aSuper Sword!", Arrays.asList("&7Line 1!", "&7Line 2!")), 0);
// We provided the EasyItem and the slot the item has to be put in.

gui.addItem(new EasyItem(Material.DIAMOND_AXE, "&aSuper Axe!", Arrays.asList("&7Line 1!", "&7Line 2!")), 9);

Inventory inventory = gui.getInventory();
```

That's all for now, stay tuned for cool updates!
