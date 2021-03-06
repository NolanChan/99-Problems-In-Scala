S-99: Ninety-Nine Problems in Scala + #100DaysOfCode Challenge Journal
------------

Inspired by [Alexander Kallaway's #100DaysOfCode Challenge](https://medium.freecodecamp.com/start-2017-with-the-100daysofcode-improved-and-updated-18ce604b237b#.qv02ziw4a), I want to commit to progressively working on the 99 Problems, Scala Edition for 99 days. I've been taught that any good New Years Resolution (or resolution in general) will ultimately fail unless you make it MEASUREABLE. And taking this equation from AMP conference writer Sarah Chan:

_GOAL + DO + WHEN = MEASURABLE GOAL_

So for the next 99 days, my _goal_ will be to work on the 99 Problems in Scala for at least 30 minutes a day. Each problem ranges in difficulty, and I don't think I can expect to finish each one in one day's time. But I'll devote 30 minutes to coding with Github being my bookkeeper. Unlike the original #100DaysOfCode, since I'm trying to learn Scala from scratch, I won't be able to start on any projects at first. Yet by at least day 45, I should be on the look out for projects I can contribute to. 

I'll also be updating this readme with a log/journal on my progress:

###Journal

####Day 1: January 5th, 2017 
My initial commitment to this challenge. I uploaded my first 3 problems in Scala. Extremely trivial problems, but they're great excuses for me to look through the Scala Documentation!

####Day 2+3: January 6th + 7th, 2017
Worked extra long to make up for both days. Though I got through only 4 and 5, it was good practice to try different methods in obtaining the solution (built in, recursive, tail recursive, functional)

####Day 4: January 8th, 2017
_Today's Progress_: Instead of working on a few Scala problems, I finished up a long overdue PR and started another for Lale.

_Takeaway_: I feel like I'm learning HTML and CSS from near scratch again (and again, and again...) but projects like these help me put front-end development into a concrete application, even if it's simplistic.

_Link(s) to work_: [Closing All of a Lale Project](https://github.com/lale-help/lale-help/pull/443/commits/344112b6ce090bf2cf6af7cf45214a143a58928b) & [File Details Mini-widget](https://github.com/lale-help/lale-help/issues/433)

####Day 5: January 9th, 2017
_Today's Progress_: ~~I can't believe I spent the past 50 minutes just trying to figure out how make cases work for problem #7 while making pretty much zero progress. I probably should have recorded my iterations to remember what I had done. I can't seem figure out how to match for a list inside a list~~
The final 10 minutes were the breakthrough that I was hoping for, but mostly because I found out that ++: preserved the List type that I wanted. I'm glad that the logic came all together though for the recursive solution. The FlatMap solution presented is much cleaner, albeit I never would have known about the functionality if I didn't see it.

_Takeaway_: It's discouraging to be stuck on such simple a task at the start of learning a new language, but learning anything new never comes easy

_Link(s) to work_: [Problems #6 and #7 of the Scala 99](http://aperiodic.net/phil/scala/s-99/#p07) 

####Day 6: January 11th, 2017
_Today's Progress_: Was feeling lazy yesterday, so I didn't work on some problems. Thinking back, I really regret it. Today, I started reading Scala for the Impatient and got through about 11 pages. It's good to read about the basics, RichInt, StringOps, everything being an object, when I don't need a return type (non-recursive functions), types of for loops, etc. 
I also started and finished the first week of homework for the online Scala Coursera course. I felt that substituted for about a day or two of work.

_Takeaway_: There's so many resources on Scala! It's just a matter of diligence and not getting bored/discouraged.

_Link(s) to work_: [Week 1 Scala on Coursera](https://www.coursera.org/learn/progfun1/programming/Ey6Jf/recursion) 

####Day 7: January 12th, 2017
_Today's Progress_: I was pretty stuck with P08 because I was unfamiliar with Scala's match syntax and got a lot of false positives. However, I finished it by adding in a few extra match cases. Not the most efficient in terms of recrusion, but it's a learning process.

_Takeaway_: Don't be afraid to comment out wrong methods so I can leave mistakes for posterity's sake

_Link(s) to work_: [Problem #8 of the Scala 99](http://aperiodic.net/phil/scala/s-99/#p08)

####Day 8: January 14th, 2017
_Today's Progress_: Skipped the 13th because of a busy day down in Torrance. Today, I reviewed the binary search algorithm and an additional problem. Also included tests with Python's unittest module!

_Takeaway_: Common algorithms can be deceptively complex. Practice, practice, practice!

_Link(s) to work_: [Shifted Array Search](https://www.pramp.com/question/N5LYMbYzyOtbpovQoYPX)

####Day 9: January 15th, 2017
_Today's Progress_: Pretty standard problems 9 through 11. They built on one another so they were a bit easier to crank out. I though I was pretty clever in discovering `takeWhile`, but they one-upped me in the solutions by showing me `span`!

_Takeaway_: There's so many different functions in Scala that do way more than I'd anticipate. Know the scala doc well!

_Link(s) to work_: [Problems #9, #10, #11 of the Scala 99](http://aperiodic.net/phil/scala/s-99/#p09)

####Day 10 + 11: January 16th-17th, 2017
_Today's Progress_: Worked on issues #330 and #332 for Lale. Finished up #332 after scouring documentation on how to efficiently do a "where" in Rails since I haven't done it in a while. #330 is taking me a while because implementing validations alongside mutations isn't giving me any results. Also trying to implement client side validations is becoming difficult because i don't know how to debug rails JS. 

_Takeaway_: Writing pure JS in rails is becoming very difficult, I need to look into ways of debugging.

_Link(s) to work_: [PR for #332](https://github.com/lale-help/lale-help/pull/454#issuecomment-273240830) and [Issue for #330](https://github.com/lale-help/lale-help/issues/330#issuecomment-273194004)

####Day 12: January 18th, 2017
_Today's Progress_: Learned more about Scala's Type Inference, insomuch that I need to learn a lot more about it

_Takeaway_: Don't just try to power through language detail conundrums when learning a new language. I would have never figured out my type inference problem without SO.

_Link(s) to work_: [Problem #12 of the Scala 99](http://aperiodic.net/phil/scala/s-99/#p12)

####Day 13: January 22th, 2017
_Today's Progress_: Took a long break while on my company's retreat. Mostly had to get reacquainted with scala and understand how to use span and multi-variable assignment. Not too difficult once I could understand span.

_Takeaway_: Don't be afraid about trying to get back up to speed, it'll probably come back faster than you think.

_Link(s) to work_: [Problem #13 of the Scala 99](http://aperiodic.net/phil/scala/s-99/#p13)

####Day 14: January 23th, 2017
_Today's Progress_: Worked a couple hours and completed my first iteration of Issue #330 on Lale. It consisted of front-end validations, back-end validations, creating new model attributes, and working on some html/css. Glad I was able to work up and down the stack.

_Takeaway_: Rails JS debugging is like any other type of JS debugging in Chrome Dev tools.

_Link(s) to work_: [#330 on Lale](https://github.com/lale-help/lale-help/pull/455)

####Day 15: January 24th, 2017
_Today's Progress_: Working through a Machine Learning example referred to by Jorge Ferrer in his ML presentation. Currently working through a Neural Nets example using Python and Spark.

_Takeaway_: Machine Learning is pretty crazy, but there's a lot of tools that make it suprisingly accessible. 

_Link(s) to work_: [Neural Nets example](https://hub.docker.com/r/mdelapenya/spark-2-ml/)

####Day 16: January 26th, 2017
_Today's Progress_: Worked through exercises #14-16, more practice

_Takeaway_: Interesting article on Nautil.us, "How I Rewired My Brain to Become Fluent at Math." Takeaway is that a deep understanding cannot be divorced from constant practice to gain mastery over a subject. 

_Link(s) to work_: [Problem #14 of the Scala 99](http://aperiodic.net/phil/scala/s-99/#p14)

####Day 17: January 28th, 2017
_Today's Progress_: Worked on the tail recursive + functional solution of #16. Also going through Scala 101 on Big Data University, hopefully I can move through one video and a problem a day. Slow and Steady wins the race! (I hope). I covered Scala classes and fields, which aren't too difficult. But I'm definietly not familiar with the syntax, nor how Scala can be OO. 

_Takeaway_: 

_Link(s) to work_: [Problem #16 of the Scala 99](http://aperiodic.net/phil/scala/s-99/#p16)

####Day 18: January 29th, 2017
_Today's Progress_: Worked through problem #17, learning a bit about tuples in Scala.

_Takeaway_: 

_Link(s) to work_: [Problem #17 of the Scala 99](http://aperiodic.net/phil/scala/s-99/#p16)

####Day 19: January 30th, 2017
_Today's Progress_: Worked through problem #18, 19, 20. I'm probably just going to be focusing on the most concise answers and not go out of my way to write recursive methods anymore since I want to be getting to the meatier parts. Got myself locked out of my Big Data account cause I tried to log in too many times. 

_Takeaway_: Just ask for the password reset...

_Link(s) to work_: [Problem #18 of the Scala 99](http://aperiodic.net/phil/scala/s-99/#p16)