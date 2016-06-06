
//----------------------------------------------------


import java_cup.runtime.*;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\124\000\002\002\004\000\002\002\004\000\002\013" +
    "\002\000\002\014\002\000\002\015\002\000\002\016\002" +
    "\000\002\017\002\000\002\020\002\000\002\021\002\000" +
    "\002\022\002\000\002\023\002\000\002\024\002\000\002" +
    "\025\002\000\002\026\002\000\002\027\002\000\002\003" +
    "\040\000\002\030\002\000\002\031\002\000\002\032\002" +
    "\000\002\004\015\000\002\005\005\000\002\033\002\000" +
    "\002\034\002\000\002\035\002\000\002\036\002\000\002" +
    "\037\002\000\002\040\002\000\002\041\002\000\002\006" +
    "\032\000\002\042\002\000\002\043\002\000\002\007\007" +
    "\000\002\007\003\000\002\007\003\000\002\007\003\000" +
    "\002\044\002\000\002\010\006\000\002\045\002\000\002" +
    "\046\002\000\002\047\002\000\002\050\002\000\002\010" +
    "\015\000\002\051\002\000\002\052\002\000\002\053\002" +
    "\000\002\010\012\000\002\054\002\000\002\055\002\000" +
    "\002\056\002\000\002\010\012\000\002\057\002\000\002" +
    "\010\007\000\002\060\002\000\002\061\002\000\002\062" +
    "\002\000\002\010\014\000\002\011\004\000\002\011\003" +
    "\000\002\011\003\000\002\011\003\000\002\011\003\000" +
    "\002\063\002\000\002\011\007\000\002\064\002\000\002" +
    "\011\006\000\002\065\002\000\002\066\002\000\002\067" +
    "\002\000\002\011\014\000\002\011\003\000\002\011\003" +
    "\000\002\011\003\000\002\011\003\000\002\070\002\000" +
    "\002\071\002\000\002\072\002\000\002\011\012\000\002" +
    "\073\002\000\002\074\002\000\002\011\010\000\002\011" +
    "\003\000\002\075\002\000\002\011\006\000\002\012\002" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\247\000\004\004\006\001\002\000\004\004\174\001" +
    "\002\000\004\002\173\001\002\000\004\005\uffff\001\002" +
    "\000\004\005\uffae\001\002\000\004\005\011\001\002\000" +
    "\004\007\ufffe\001\002\000\004\007\013\001\002\000\004" +
    "\010\ufffd\001\002\000\004\010\015\001\002\000\004\011" +
    "\ufffc\001\002\000\004\011\017\001\002\000\004\012\ufffb" +
    "\001\002\000\004\012\021\001\002\000\004\013\ufffa\001" +
    "\002\000\004\013\023\001\002\000\004\044\ufff9\001\002" +
    "\000\004\044\025\001\002\000\004\014\ufff8\001\002\000" +
    "\004\014\027\001\002\000\004\015\ufff7\001\002\000\004" +
    "\015\031\001\002\000\004\016\ufff6\001\002\000\004\016" +
    "\uffae\001\002\000\004\016\034\001\002\000\004\005\ufff5" +
    "\001\002\000\004\005\036\001\002\000\016\005\ufff4\014" +
    "\ufff4\023\ufff4\025\ufff4\026\ufff4\027\ufff4\001\002\000\016" +
    "\005\040\014\uffae\023\044\025\042\026\043\027\uffae\001" +
    "\002\000\016\005\uffde\014\uffde\023\uffde\025\uffde\026\uffde" +
    "\027\uffde\001\002\000\004\006\165\001\002\000\004\013" +
    "\uffd7\001\002\000\004\013\uffd3\001\002\000\004\013\uffdc" +
    "\001\002\000\006\014\047\027\046\001\002\000\036\013" +
    "\uffcf\014\uffcf\020\uffcf\030\uffcf\031\uffcf\032\uffcf\033\uffcf" +
    "\034\uffcf\035\uffcf\037\uffcf\040\uffcf\041\uffcf\042\uffcf\043" +
    "\uffcf\001\002\000\036\013\uffcd\014\uffcd\015\uffcd\030\uffcd" +
    "\031\uffcd\032\uffcd\033\uffcd\034\uffcd\035\uffcd\037\uffcd\040" +
    "\uffcd\041\uffcd\042\uffcd\043\uffcd\001\002\000\036\013\062" +
    "\014\uffae\015\uffae\030\uffae\031\057\032\056\033\061\034" +
    "\060\035\uffae\037\055\040\054\041\063\042\053\043\064" +
    "\001\002\000\020\014\uffba\015\uffba\016\uffba\020\uffba\021" +
    "\uffba\030\uffba\035\uffba\001\002\000\012\014\072\015\124" +
    "\030\070\035\071\001\002\000\006\013\uffb4\045\uffb8\001" +
    "\002\000\020\014\uffbb\015\uffbb\016\uffbb\020\uffbb\021\uffbb" +
    "\030\uffbb\035\uffbb\001\002\000\020\014\uffbc\015\uffbc\016" +
    "\uffbc\020\uffbc\021\uffbc\030\uffbc\035\uffbc\001\002\000\020" +
    "\014\uffc7\015\uffc7\016\uffc7\020\uffc7\021\uffc7\030\uffc7\035" +
    "\uffc7\001\002\000\020\014\uffc8\015\uffc8\016\uffc8\020\uffc8" +
    "\021\uffc8\030\uffc8\035\uffc8\001\002\000\020\014\uffc5\015" +
    "\uffc5\016\uffc5\020\uffc5\021\uffc5\030\uffc5\035\uffc5\001\002" +
    "\000\020\014\uffc6\015\uffc6\016\uffc6\020\uffc6\021\uffc6\030" +
    "\uffc6\035\uffc6\001\002\000\036\013\uffb0\014\uffb0\016\uffb0" +
    "\030\uffb0\031\uffb0\032\uffb0\033\uffb0\034\uffb0\035\uffb0\037" +
    "\uffb0\040\uffb0\041\uffb0\042\uffb0\043\uffb0\001\002\000\020" +
    "\014\uffb9\015\uffb9\016\uffb9\020\uffb9\021\uffb9\030\uffb9\035" +
    "\uffb9\001\002\000\020\014\uffb1\015\uffb1\016\uffb1\020\uffb1" +
    "\021\uffb1\030\uffb1\035\uffb1\001\002\000\036\013\062\014" +
    "\uffae\016\uffae\030\uffae\031\057\032\056\033\061\034\060" +
    "\035\uffae\037\055\040\054\041\063\042\053\043\064\001" +
    "\002\000\012\014\072\016\067\030\070\035\071\001\002" +
    "\000\020\014\uffaf\015\uffaf\016\uffaf\020\uffaf\021\uffaf\030" +
    "\uffaf\035\uffaf\001\002\000\020\014\uffc9\015\uffc9\016\uffc9" +
    "\020\uffc9\021\uffc9\030\uffc9\035\uffc9\001\002\000\040\013" +
    "\uffc0\014\uffc0\021\uffc0\030\uffc0\031\uffc0\032\uffc0\033\uffc0" +
    "\034\uffc0\035\uffc0\036\uffc2\037\uffc0\040\uffc0\041\uffc0\042" +
    "\uffc0\043\uffc0\001\002\000\036\013\uffc4\014\uffc4\015\uffc4" +
    "\030\uffc4\031\uffc4\032\uffc4\033\uffc4\034\uffc4\035\uffc4\037" +
    "\uffc4\040\uffc4\041\uffc4\042\uffc4\043\uffc4\001\002\000\036" +
    "\013\062\014\uffae\015\uffae\030\uffae\031\057\032\056\033" +
    "\061\034\060\035\uffae\037\055\040\054\041\063\042\053" +
    "\043\064\001\002\000\012\014\072\015\075\030\070\035" +
    "\071\001\002\000\020\014\uffc3\015\uffc3\016\uffc3\020\uffc3" +
    "\021\uffc3\030\uffc3\035\uffc3\001\002\000\036\013\uffae\014" +
    "\uffae\021\uffae\030\uffae\031\uffae\032\uffae\033\uffae\034\uffae" +
    "\035\uffae\037\uffae\040\uffae\041\uffae\042\uffae\043\uffae\001" +
    "\002\000\004\036\100\001\002\000\020\014\uffc1\015\uffc1" +
    "\016\uffc1\020\uffc1\021\uffc1\030\uffc1\035\uffc1\001\002\000" +
    "\036\013\uffbf\014\uffbf\021\uffbf\030\uffbf\031\uffbf\032\uffbf" +
    "\033\uffbf\034\uffbf\035\uffbf\037\uffbf\040\uffbf\041\uffbf\042" +
    "\uffbf\043\uffbf\001\002\000\036\013\062\014\uffae\021\uffae" +
    "\030\uffae\031\057\032\056\033\061\034\060\035\uffae\037" +
    "\055\040\054\041\063\042\053\043\064\001\002\000\012" +
    "\014\072\021\104\030\070\035\071\001\002\000\036\013" +
    "\uffbe\014\uffbe\016\uffbe\030\uffbe\031\uffbe\032\uffbe\033\uffbe" +
    "\034\uffbe\035\uffbe\037\uffbe\040\uffbe\041\uffbe\042\uffbe\043" +
    "\uffbe\001\002\000\036\013\062\014\uffae\016\uffae\030\uffae" +
    "\031\057\032\056\033\061\034\060\035\uffae\037\055\040" +
    "\054\041\063\042\053\043\064\001\002\000\012\014\072" +
    "\016\107\030\070\035\071\001\002\000\020\014\uffbd\015" +
    "\uffbd\016\uffbd\020\uffbd\021\uffbd\030\uffbd\035\uffbd\001\002" +
    "\000\004\045\116\001\002\000\004\013\uffae\001\002\000" +
    "\004\013\113\001\002\000\004\016\uffb3\001\002\000\004" +
    "\016\115\001\002\000\020\014\uffb2\015\uffb2\016\uffb2\020" +
    "\uffb2\021\uffb2\030\uffb2\035\uffb2\001\002\000\004\014\uffb7" +
    "\001\002\000\004\014\120\001\002\000\036\013\uffb6\014" +
    "\uffb6\015\uffb6\030\uffb6\031\uffb6\032\uffb6\033\uffb6\034\uffb6" +
    "\035\uffb6\037\uffb6\040\uffb6\041\uffb6\042\uffb6\043\uffb6\001" +
    "\002\000\036\013\062\014\uffae\015\uffae\030\uffae\031\057" +
    "\032\056\033\061\034\060\035\uffae\037\055\040\054\041" +
    "\063\042\053\043\064\001\002\000\012\014\072\015\123" +
    "\030\070\035\071\001\002\000\020\014\uffb5\015\uffb5\016" +
    "\uffb5\020\uffb5\021\uffb5\030\uffb5\035\uffb5\001\002\000\004" +
    "\027\uffcc\001\002\000\004\027\126\001\002\000\036\013" +
    "\uffcb\014\uffcb\020\uffcb\030\uffcb\031\uffcb\032\uffcb\033\uffcb" +
    "\034\uffcb\035\uffcb\037\uffcb\040\uffcb\041\uffcb\042\uffcb\043" +
    "\uffcb\001\002\000\036\013\062\014\uffae\020\uffae\030\uffae" +
    "\031\057\032\056\033\061\034\060\035\uffae\037\055\040" +
    "\054\041\063\042\053\043\064\001\002\000\012\014\072" +
    "\020\131\030\070\035\071\001\002\000\010\006\uffca\022" +
    "\uffca\024\uffca\001\002\000\036\013\062\014\uffae\020\uffae" +
    "\030\uffae\031\057\032\056\033\061\034\060\035\uffae\037" +
    "\055\040\054\041\063\042\053\043\064\001\002\000\012" +
    "\014\072\020\134\030\070\035\071\001\002\000\010\006" +
    "\uffce\022\uffce\024\uffce\001\002\000\004\013\136\001\002" +
    "\000\036\013\uffdb\014\uffdb\016\uffdb\030\uffdb\031\uffdb\032" +
    "\uffdb\033\uffdb\034\uffdb\035\uffdb\037\uffdb\040\uffdb\041\uffdb" +
    "\042\uffdb\043\uffdb\001\002\000\036\013\062\014\uffae\016" +
    "\uffae\030\uffae\031\057\032\056\033\061\034\060\035\uffae" +
    "\037\055\040\054\041\063\042\053\043\064\001\002\000" +
    "\012\014\072\016\141\030\070\035\071\001\002\000\016" +
    "\005\uffda\014\uffda\023\uffda\025\uffda\026\uffda\027\uffda\001" +
    "\002\000\016\005\040\014\uffae\023\044\025\042\026\043" +
    "\027\uffae\001\002\000\004\024\144\001\002\000\016\005" +
    "\uffd9\014\uffd9\023\uffd9\025\uffd9\026\uffd9\027\uffd9\001\002" +
    "\000\016\005\040\014\uffae\023\044\025\042\026\043\027" +
    "\uffae\001\002\000\010\006\uffd8\022\uffd8\024\uffd8\001\002" +
    "\000\004\013\150\001\002\000\036\013\uffd2\014\uffd2\016" +
    "\uffd2\030\uffd2\031\uffd2\032\uffd2\033\uffd2\034\uffd2\035\uffd2" +
    "\037\uffd2\040\uffd2\041\uffd2\042\uffd2\043\uffd2\001\002\000" +
    "\036\013\062\014\uffae\016\uffae\030\uffae\031\057\032\056" +
    "\033\061\034\060\035\uffae\037\055\040\054\041\063\042" +
    "\053\043\064\001\002\000\012\014\072\016\153\030\070" +
    "\035\071\001\002\000\004\020\uffd1\001\002\000\004\020" +
    "\155\001\002\000\010\006\uffd0\022\uffd0\024\uffd0\001\002" +
    "\000\004\013\157\001\002\000\036\013\uffd6\014\uffd6\016" +
    "\uffd6\030\uffd6\031\uffd6\032\uffd6\033\uffd6\034\uffd6\035\uffd6" +
    "\037\uffd6\040\uffd6\041\uffd6\042\uffd6\043\uffd6\001\002\000" +
    "\036\013\062\014\uffae\016\uffae\030\uffae\031\057\032\056" +
    "\033\061\034\060\035\uffae\037\055\040\054\041\063\042" +
    "\053\043\064\001\002\000\012\014\072\016\162\030\070" +
    "\035\071\001\002\000\016\005\uffd5\014\uffd5\023\uffd5\025" +
    "\uffd5\026\uffd5\027\uffd5\001\002\000\016\005\040\014\uffae" +
    "\023\044\025\042\026\043\027\uffae\001\002\000\010\006" +
    "\uffd4\022\uffd4\024\uffd4\001\002\000\004\006\ufff3\001\002" +
    "\000\004\006\167\001\002\000\004\004\ufff2\001\002\000" +
    "\016\005\040\014\uffae\023\044\025\042\026\043\027\uffae" +
    "\001\002\000\004\006\172\001\002\000\010\006\uffdd\022" +
    "\uffdd\024\uffdd\001\002\000\004\002\000\001\002\000\004" +
    "\017\ufff1\001\002\000\004\002\001\001\002\000\004\017" +
    "\uffae\001\002\000\004\017\200\001\002\000\004\005\ufff0" +
    "\001\002\000\004\005\uffae\001\002\000\004\005\203\001" +
    "\002\000\010\020\uffef\045\uffef\046\uffef\001\002\000\010" +
    "\020\uffae\045\207\046\211\001\002\000\004\007\221\001" +
    "\002\000\004\020\uffae\001\002\000\014\013\uffe0\014\uffe4" +
    "\016\uffe0\020\uffe0\021\uffe0\001\002\000\012\013\uffdf\016" +
    "\uffdf\020\uffdf\021\uffdf\001\002\000\012\013\uffe1\016\uffe1" +
    "\020\uffe1\021\uffe1\001\002\000\004\014\213\001\002\000" +
    "\004\015\uffe3\001\002\000\004\015\215\001\002\000\012" +
    "\013\uffe2\016\uffe2\020\uffe2\021\uffe2\001\002\000\004\020" +
    "\217\001\002\000\020\005\uffed\007\uffed\014\uffed\023\uffed" +
    "\025\uffed\026\uffed\027\uffed\001\002\000\004\006\251\001" +
    "\002\000\010\013\uffec\045\uffec\046\uffec\001\002\000\010" +
    "\013\uffae\045\207\046\211\001\002\000\004\013\uffae\001" +
    "\002\000\004\013\225\001\002\000\010\021\uffeb\045\uffeb" +
    "\046\uffeb\001\002\000\010\021\uffae\045\207\046\211\001" +
    "\002\000\004\021\uffae\001\002\000\004\021\231\001\002" +
    "\000\010\016\uffea\045\uffea\046\uffea\001\002\000\010\016" +
    "\uffae\045\207\046\211\001\002\000\004\016\uffae\001\002" +
    "\000\004\016\235\001\002\000\004\005\uffe9\001\002\000" +
    "\004\005\237\001\002\000\010\020\uffe8\045\uffe8\046\uffe8" +
    "\001\002\000\010\020\uffae\045\207\046\211\001\002\000" +
    "\016\005\040\014\uffae\023\044\025\042\026\043\027\uffae" +
    "\001\002\000\004\022\243\001\002\000\036\013\uffe7\014" +
    "\uffe7\020\uffe7\030\uffe7\031\uffe7\032\uffe7\033\uffe7\034\uffe7" +
    "\035\uffe7\037\uffe7\040\uffe7\041\uffe7\042\uffe7\043\uffe7\001" +
    "\002\000\036\013\062\014\uffae\020\uffae\030\uffae\031\057" +
    "\032\056\033\061\034\060\035\uffae\037\055\040\054\041" +
    "\063\042\053\043\064\001\002\000\012\014\072\020\246" +
    "\030\070\035\071\001\002\000\004\006\uffe6\001\002\000" +
    "\004\006\250\001\002\000\004\006\uffe5\001\002\000\004" +
    "\002\uffee\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\247\000\006\002\004\003\003\001\001\000\004\004" +
    "\174\001\001\000\002\001\001\000\004\013\006\001\001" +
    "\000\004\012\007\001\001\000\002\001\001\000\004\014" +
    "\011\001\001\000\002\001\001\000\004\015\013\001\001" +
    "\000\002\001\001\000\004\016\015\001\001\000\002\001" +
    "\001\000\004\017\017\001\001\000\002\001\001\000\004" +
    "\020\021\001\001\000\002\001\001\000\004\021\023\001" +
    "\001\000\002\001\001\000\004\022\025\001\001\000\002" +
    "\001\001\000\004\023\027\001\001\000\002\001\001\000" +
    "\004\024\031\001\001\000\004\012\032\001\001\000\002" +
    "\001\001\000\004\025\034\001\001\000\002\001\001\000" +
    "\004\026\036\001\001\000\006\010\040\012\044\001\001" +
    "\000\004\044\167\001\001\000\002\001\001\000\004\051" +
    "\155\001\001\000\004\054\146\001\001\000\004\045\134" +
    "\001\001\000\002\001\001\000\004\057\131\001\001\000" +
    "\004\060\047\001\001\000\006\011\051\012\050\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\070\107\073" +
    "\110\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\075\064\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\011\065\012\050\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\064\076" +
    "\065\075\001\001\000\004\063\072\001\001\000\006\011" +
    "\073\012\050\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\100\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\066\101\001\001\000\006\011\102\012\050" +
    "\001\001\000\002\001\001\000\004\067\104\001\001\000" +
    "\006\011\105\012\050\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\012\111\001\001\000" +
    "\002\001\001\000\004\074\113\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\071\116\001\001\000\002\001" +
    "\001\000\004\072\120\001\001\000\006\011\121\012\050" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\061" +
    "\124\001\001\000\002\001\001\000\004\062\126\001\001" +
    "\000\006\011\127\012\050\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\011\132\012\050\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\046" +
    "\136\001\001\000\006\011\137\012\050\001\001\000\002" +
    "\001\001\000\004\047\141\001\001\000\006\010\142\012" +
    "\044\001\001\000\002\001\001\000\004\050\144\001\001" +
    "\000\006\010\145\012\044\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\055\150\001\001\000\006\011\151" +
    "\012\050\001\001\000\002\001\001\000\004\056\153\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\052\157\001\001\000\006\011\160\012\050\001" +
    "\001\000\002\001\001\000\004\053\162\001\001\000\006" +
    "\010\163\012\044\001\001\000\002\001\001\000\004\027" +
    "\165\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\010\170\012\044\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\030\175\001\001\000\002" +
    "\001\001\000\004\012\176\001\001\000\002\001\001\000" +
    "\004\031\200\001\001\000\004\012\201\001\001\000\002" +
    "\001\001\000\004\032\203\001\001\000\010\005\204\007" +
    "\205\012\207\001\001\000\004\006\217\001\001\000\004" +
    "\012\215\001\001\000\004\042\211\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\043\213" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\033\221" +
    "\001\001\000\006\007\222\012\207\001\001\000\004\012" +
    "\223\001\001\000\002\001\001\000\004\034\225\001\001" +
    "\000\006\007\226\012\207\001\001\000\004\012\227\001" +
    "\001\000\002\001\001\000\004\035\231\001\001\000\006" +
    "\007\232\012\207\001\001\000\004\012\233\001\001\000" +
    "\002\001\001\000\004\036\235\001\001\000\002\001\001" +
    "\000\004\037\237\001\001\000\010\005\240\007\205\012" +
    "\207\001\001\000\006\010\241\012\044\001\001\000\002" +
    "\001\001\000\004\040\243\001\001\000\006\011\244\012" +
    "\050\001\001\000\002\001\001\000\004\041\246\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

  ComplexSymbolFactory f = new ComplexSymbolFactory();
  symbolFactory = f;
  File file = new File("input.txt");
  FileInputStream fis = null;
  try {
    fis = new FileInputStream(file);
  } catch (IOException e) {
    e.printStackTrace();
  } 
  lexer = new Lexer(f,fis);

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return lexer.next_token(); 
    }


  protected Lexer lexer;


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // goal ::= mainClass classDeclaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("goal",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= goal EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // NT$0 ::= 
            {
              Object RESULT =null;
 System.out.print(" class "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$1 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" { "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // NT$2 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" public "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$3 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" static "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$3",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NT$4 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" void "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$4",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NT$5 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" main "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$5",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // NT$6 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" ( "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$6",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NT$7 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" String "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$7",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NT$8 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" [ "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$8",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // NT$9 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" ] "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$9",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // NT$10 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" ) "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$10",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NT$11 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" { "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$11",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // NT$12 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" } "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$12",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // mainClass ::= CLASS NT$0 id ACHAVE NT$1 PUBLIC NT$2 STATIC NT$3 VOID NT$4 MAIN NT$5 APARENTESE NT$6 STRING NT$7 ACOLCHETE NT$8 FCOLCHETE NT$9 id FPARENTESE NT$10 ACHAVE NT$11 stmt FCHAVE NT$12 FCHAVE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$12
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 System.out.print(" } "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mainClass",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-29)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // NT$13 ::= 
            {
              Object RESULT =null;
 System.out.print(" class "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$13",22, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // NT$14 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" extends "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$14",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // NT$15 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" { "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$15",24, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // classDeclaration ::= CLASS NT$13 id EXTENDS NT$14 id ACHAVE NT$15 varDeclaration methodDeclaration FCHAVE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$15
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		 System.out.print(" } "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("classDeclaration",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // varDeclaration ::= type id PVIRGULA 
            {
              Object RESULT =null;
		 System.out.print(" ; "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("varDeclaration",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // NT$16 ::= 
            {
              Object RESULT =null;
 System.out.print(" public "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$16",25, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // NT$17 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
 System.out.print(" ( "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$17",26, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // NT$18 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
 System.out.print(" , "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$18",27, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // NT$19 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
 System.out.print(" ) "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$19",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // NT$20 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" { "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$20",29, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // NT$21 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
 System.out.print(" return "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$21",30, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // NT$22 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" ; "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$22",31, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // methodDeclaration ::= PUBLIC NT$16 type id APARENTESE NT$17 type id VIRGULA NT$18 type id FPARENTESE NT$19 ACHAVE NT$20 varDeclaration stmt RETURN NT$21 express PVIRGULA NT$22 FCHAVE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$22
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 System.out.print(" } "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("methodDeclaration",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-23)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // NT$23 ::= 
            {
              Object RESULT =null;
 System.out.print(" int "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$23",32, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // NT$24 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" [ "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$24",33, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // type ::= NUMBER NT$23 ACOLCHETE NT$24 FCOLCHETE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$24
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 System.out.print(" ] "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // type ::= BOOLEANO 
            {
              Object RESULT =null;
		 System.out.print(" boolean "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // type ::= NUMBER 
            {
              Object RESULT =null;
		 System.out.print(" int "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // type ::= id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // NT$25 ::= 
            {
              Object RESULT =null;
 System.out.print(" { "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$25",34, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // stmt ::= ACHAVE NT$25 stmt FCHAVE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$25
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 System.out.print(" } "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // NT$26 ::= 
            {
              Object RESULT =null;
 System.out.print(" if "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$26",35, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // NT$27 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" ( "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$27",36, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // NT$28 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" ) "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$28",37, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // NT$29 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" else "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$29",38, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // stmt ::= IF NT$26 APARENTESE NT$27 express FPARENTESE NT$28 stmt ELSE NT$29 stmt 
            {
              Object RESULT =null;
              // propagate RESULT from NT$29
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // NT$30 ::= 
            {
              Object RESULT =null;
 System.out.print(" while "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$30",39, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // NT$31 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" ( "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$31",40, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // NT$32 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" ) "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$32",41, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // stmt ::= WHILE NT$30 APARENTESE NT$31 express FPARENTESE NT$32 stmt 
            {
              Object RESULT =null;
              // propagate RESULT from NT$32
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // NT$33 ::= 
            {
              Object RESULT =null;
 System.out.print(" System.out.println "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$33",42, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // NT$34 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" ( "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$34",43, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // NT$35 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" ) "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$35",44, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // stmt ::= IMPRIMIR NT$33 APARENTESE NT$34 express FPARENTESE NT$35 PVIRGULA 
            {
              Object RESULT =null;
              // propagate RESULT from NT$35
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 System.out.print(" ; "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // NT$36 ::= 
            {
              Object RESULT =null;
 System.out.print(" = "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$36",45, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // stmt ::= id IGUAL NT$36 express PVIRGULA 
            {
              Object RESULT =null;
              // propagate RESULT from NT$36
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 System.out.print(" ; "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // NT$37 ::= 
            {
              Object RESULT =null;
 System.out.print(" [ "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$37",46, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // NT$38 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" ] "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$38",47, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // NT$39 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" = "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$39",48, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // stmt ::= id ACOLCHETE NT$37 express FCOLCHETE NT$38 IGUAL NT$39 express PVIRGULA 
            {
              Object RESULT =null;
              // propagate RESULT from NT$39
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 System.out.print(" ; "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // express ::= express E 
            {
              Object RESULT =null;
		 System.out.print(" && "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // express ::= MENORQ 
            {
              Object RESULT =null;
		 System.out.print(" < "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // express ::= ADICAO 
            {
              Object RESULT =null;
		 System.out.print(" + "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 59: // express ::= SUBTRACAO 
            {
              Object RESULT =null;
		 System.out.print(" - "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 60: // express ::= MULTIPLICACAO 
            {
              Object RESULT =null;
		 System.out.print(" * "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 61: // NT$40 ::= 
            {
              Object RESULT =null;
 System.out.print(" [ "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$40",49, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 62: // express ::= express ACOLCHETE NT$40 express FCOLCHETE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$40
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 System.out.print(" ] "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 63: // NT$41 ::= 
            {
              Object RESULT =null;
 System.out.print(" . "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$41",50, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 64: // express ::= express PONTO NT$41 TAMANHO 
            {
              Object RESULT =null;
              // propagate RESULT from NT$41
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 System.out.print(" length "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 65: // NT$42 ::= 
            {
              Object RESULT =null;
 System.out.print(" . "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$42",51, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 66: // NT$43 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" ( "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$43",52, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 67: // NT$44 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" , "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$44",53, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 68: // express ::= express PONTO NT$42 id NT$43 express VIRGULA NT$44 express FPARENTESE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$44
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 System.out.print(" ) "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 69: // express ::= VERDADEIRO 
            {
              Object RESULT =null;
		 System.out.print(" true "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 70: // express ::= FALSO 
            {
              Object RESULT =null;
		 System.out.print(" false "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 71: // express ::= id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 72: // express ::= THIS 
            {
              Object RESULT =null;
		 System.out.print(" this "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 73: // NT$45 ::= 
            {
              Object RESULT =null;
 System.out.print(" new "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$45",54, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 74: // NT$46 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" int "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$46",55, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 75: // NT$47 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 System.out.print(" [ "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$47",56, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 76: // express ::= NEW NT$45 NUMBER NT$46 ACOLCHETE NT$47 express FCOLCHETE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$47
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 System.out.print(" ] "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 77: // NT$48 ::= 
            {
              Object RESULT =null;
 System.out.print(" new "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$48",57, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 78: // NT$49 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.print(" ( "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$49",58, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 79: // express ::= NEW NT$48 id APARENTESE NT$49 FPARENTESE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$49
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 System.out.print(" ) "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 80: // express ::= NOT 
            {
              Object RESULT =null;
		 System.out.print(" ! "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 81: // NT$50 ::= 
            {
              Object RESULT =null;
 System.out.print(" ( "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$50",59, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 82: // express ::= APARENTESE NT$50 express FPARENTESE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$50
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 System.out.print(" ) "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("express",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 83: // id ::= 
            {
              Object RESULT =null;
		 System.out.print (" id "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("id",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
