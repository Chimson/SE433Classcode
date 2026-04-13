package codesmells;

class PlayerController {
  
  // simple class for demonstration only
  static class Player {
    public int velocity;
    public int stamina;
    public String state;
  }
  
  public void handleInputSMELLS(String input, Player player) {
    
    if (input.equals("JUMP")) {
      player.velocity = 10;
      player.state = "JUMPING";
      System.out.println("Player jumps!");
    } else if (input.equals("DASH")) {
      player.velocity = 20;
      player.stamina -= 10;
      System.out.println("Player dashes!");
    }
  }
  
  // -----
  
  public void jump(Player player) {
    player.velocity = 10;
    player.state = "JUMPING";
    System.out.println("Player jumps!");
  }
  
  public void dash(Player player) {
    player.velocity = 20;
    player.stamina -= 10;
    System.out.println("Player dashes!");
  }
  
  public void handleInput(String input, Player player) {
    if (input.equals("JUMP")) {
      jump(player);
    }
    else if (input.equals("DASH")) {
      dash(player);
    }
  }
  
  // How would you:
    // any way to use polymorphism to make it more simple?
    // HINT: Dash implements IInputAction with .apply()
    //       Jump implements IInputAction with .apply()
    //       change input param to IInputAction
}