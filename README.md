>Rocket science for the stock market. No Bullshit.

# BullRocket

Stock market analysis with various Machine Learning algorithms.

## Neural Networks

The objective of this test case is to understand the correlation factors
between the exchange rate of some currencies, the spot price of gold and
the S&P 500 index. This is important in the diversification of an
investment portfolio (long term investing not hi-freq trading). In
diversifying a portfolio, we want to avoid instruments that are strongly
correlated ("putting all our eggs in one basket" analogy) and prefer ones
that have little correlation. A strong correlation between exchange
rates will be indicated by a neural network that has a low error rate
over some epoch iterations and low correlation by a neural network with
a high error rate after some threshold of iterations. Data feature value will
be normalized to 1 if closing price is up or -1 if down for reasons
discuss here en.wikipedia.org/wiki/Feature_selection.

For this exercise, we will use the following exchange-traded funds
(ETFs) as proxies for exchange rate of currencies:

Code | Actual
---- | -------------------------------------------
FXA  | Rate of an Australian dollar in US dollar
FXB  | Rate of a British pound in US dollar
FXE  | Rate of an Euro in US dollar
FXC  | Rate of a Canadian dollar in US dollar
FXF  | Rate of a Swiss franc in US dollar
FXY  | Rate of a Japanese yen in US dollar
CYB  | Rate of a Chinese yuan in US dollar
SPY  | S&P 500 index
GLD  | The price of gold in US dollar

Practically, the problem to solve is to extract one or more regressive
models that link one ETFs y with a basket of other ETFs {xi} y=f(xi).
For example, is there a relation between the exchange rate of the
Japanese yen (FXY) and a combination of the spot price for gold (GLD),
exchange rate of the Euro in US dollar (FXE) and the exchange rate of
the Australian dollar in US dollar (FXA), and so on? If so, the
regression f will be defined as FXY = f (GLD, FXE, FXA).

Through experimentation we find that **FXE** has some correlation with the
combinations of *(FXA, SPY, GLD, FXB, FXF, FXD, FXY, CYB)*,
*(FXC, GLD, FXA, FXY, FXB)* and *(FXF, FXB, CYB)*.

## K-Means Clustering

Trying to reproduce the the experiment here (a powerpoint download) 

[download](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=4&cad=rja&uact=8&ved=0ahUKEwib8rKrg7zKAhVBxWMKHbtGAvUQFggvMAM&url=http%3A%2F%2Fwww.cs.dartmouth.edu%2F~datamining%2FWeiPanUmangBhaskar.ppt&usg=AFQjCNGfRLyZRSZSS2rNuOI6SZWl3ipo6A)

## Support Vector Machines

