PREFIX : <http://example/> 

CREATE GRAPH <http://example/graph> ;

INSERT DATA { :r :p 123 } ;
INSERT DATA { :r :p 1066 } ;

DELETE DATA { :r :p 1066 } ;


INSERT DATA { 
  GRAPH <http://example/graph> { :r :p 123 . :r :p 1066 }
} ;

DELETE DATA { 
  GRAPH <http://example/graph>  { :r :p 123 }
}

