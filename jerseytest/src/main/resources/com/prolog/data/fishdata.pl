vulnerability('veryhigh'):-maximumlength3('verylarge').
vulnerability('high'):-maximumlength3('large').
vulnerability('moderate'):-maximumlength3('medium').
vulnerability('low'):-maximumlength3('small').
vulnerability('veryhigh'):-ageatfirstmaturity('veryhigh').
vulnerability('high'):-ageatfirstmaturity('high').
vulnerability('moderate'):-ageatfirstmaturity('medium').
vulnerability('low'):-ageatfirstmaturity('low').
vulnerability('veryhigh'):-maximumage('veryhigh').
vulnerability('high'):-maximumage('high').
vulnerability('moderate'):-maximumage('medium').
vulnerability('low'):-maximumage('low').
vulnerability('veryhigh4'):-vBGf('verylow').
vulnerability('veryhigh4'):-naturalmortality('verylow').
vulnerability('high'):-vbgfk('low').
vulnerability('high'):-naturalmortality('low').
vulnerability('medium'):-vbgfk('medium').
vulnerability('medium'):-naturalmortality('medium').
vulnerability('low'):-vbgfk('high').
vulnerability('low'):-naturalmortality('high').
vulnerability('high'):-fecundity('low').
vulnerability('veryhigh'):-fecundity('verylow').
vulnerability('low'):-spatialbehaviourstrength('low').
vulnerability('moderate'):-spatialbehaviourstrength('moderate').
vulnerability('high'):-spatialbehaviourstrength('high').
vulnerability('veryhigh'):-spatialbehaviourstrength('veryhigh').

# different level of intrinsic vulnerabilities.
# Life history characteristics and the resulting vulnerability
# Life history characteristics Low Moderate High Very high
# Maximum length (cm) 50 = Lmax 50 < Lmax = 100 100 < Lmax = 150 150 < Lmax
# Age at first maturity (year) 2 = Tm 2 < Tm < 4 4 < Tm = 6 6 < Tm
# VBGF parameter K (year-1) 0.8 < K 0.5 < K = 0.8 0.2 < K = 0.5 0.2 = K
# Natural mortality rate (year-1) 0.5 < M 0.35 < M = 0.5 0.2 < M = 0.35 0.2 = M
# Maximum age (year) 3 = Tmax 3 < Tmax = 10 10 < Tmax = 30 30 < Tmax
# Geographic range (103 km2) - - 3.2 < Range = 5.7 3.2 = Range
# Fecundity (egg,pup individual-1 year-1) - - 50 < Fec = 100 50 = Fec
# Spatial behaviour strength 40 = SB 40 < SB = 60 60 < SB = 80 80 < SB
