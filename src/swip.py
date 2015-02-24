from pyswip import Prolog
# Import modules for CGI handling 
import cgi, cgitb 

# Create instance of FieldStorage 
form = cgi.FieldStorage() 

# Get data from fields
first_name = form.getvalue('first_name')
last_name  = form.getvalue('last_name')
prolog = Prolog()

prolog.consult("../data/mod2.pl")

# A couple preliminary assertions.
#prolog.assertz("value(banana, 1 rdiv 4, bitcoin)")
#prolog.assertz("value(bitcoin, 1 rdiv 30, namecoin)")
#prolog.assertz("value(apple, 3 rdiv 4, banana)")
prolog.assertz("variety(tkm12,rice)")

# Now, how much is an orange worth in bitcoins?
result = prolog.query("season(When),days(Give),avgyield(Gives),feat(With),places(Where)").next()

print "Content-type: text/html\n\n";
print '<html>';
print '<head>';
print '<meta name="author" content="Kay Vogelgesang">';
print '<link href="/xampp/xampp.css" rel="stylesheet" type="text/css">';
print '</head>';
print "%s." % result["When"] 
print "%s" %result["Give"] 
print "%s." % result["Gives"]
print "%s." % result["With"] 
print "%s." % result["Where"]
print "<body>&nbsp;<p><h1>GCI with MiniPerl</h1>";
print first_name;
print last_name;
print  "CGI  is ready ...</body></html>";


#result = prolog.query("appraise_float(bitcoin, Price, apple)").next()
#print "A bitcoin is worth %s apples." % result["Price"]