from pyswip import Prolog

import cgi, cgitb 

prolog = Prolog()

prolog.consult("../data/mod2.pl")


prolog.assertz("variety(tkm12,rice)")


result = prolog.query("season(When),days(Give),avgyield(Gives),feat(With),places(Where)").next()

print "Content-type: text/html\n\n";
print '<html>';
print '<head>';
print '<meta name="author" content="Kay Vogelgesang">';
print '<link href="/xampp/xampp.css" rel="stylesheet" type="text/css">';
print '</head>';
print "<body>"
print "%s." % result["When"] 
print "%s" %result["Give"] 
print "%s." % result["Gives"]
print "%s." % result["With"] 
print "%s." % result["Where"]



print  "</body></html>";


#result = prolog.query("appraise_float(bitcoin, Price, apple)").next()
#print "A bitcoin is worth %s apples." % result["Price"]