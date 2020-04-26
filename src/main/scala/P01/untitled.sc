Seq(Left(2), Right(2), Seq(5,6)) map { x => x }
Seq(Seq(2,3), Seq(3,4), Seq(5,6)) map { x => x }
Seq(Seq(2,3), Seq(3,4), Seq(5,6)) flatMap { x => x }