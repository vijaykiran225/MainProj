from pyswip import Prolog

prolog = Prolog()

prolog.consult("../data/mod2.pl")

# A couple preliminary assertions.
#prolog.assertz("value(banana, 1 rdiv 4, bitcoin)")
#prolog.assertz("value(bitcoin, 1 rdiv 30, namecoin)")
#prolog.assertz("value(apple, 3 rdiv 4, banana)")
prolog.assertz("variety(tkm12,rice)")

# Now, how much is an orange worth in bitcoins?
result = prolog.query("season(When),days(Give),avgyield(Gives),feat(With),places(Where)").next()
print "%s." % result["When"] 
print "%s" %result["Give"] 
print "%s." % result["Gives"]
print "%s." % result["With"] 
print "%s." % result["Where"]

#result = prolog.query("appraise_float(bitcoin, Price, apple)").next()
#print "A bitcoin is worth %s apples." % result["Price"]