@GetMapping(path="/add")//
public @ResponseBody String addUser(@RequestParamStringname, @RequestParamStringemail){
    Usern=newUser();
    n.setName(name);
    n.setEmail(email);
    return n.toString();
}